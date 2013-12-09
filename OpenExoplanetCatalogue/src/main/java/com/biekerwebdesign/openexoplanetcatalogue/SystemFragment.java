package com.biekerwebdesign.openexoplanetcatalogue;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.biekerwebdesign.beans.System;
import com.biekerwebdesign.xml.XMLPullParserSystem;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bieker on 12/5/13.
 */
public class SystemFragment extends Fragment {

    private ListView listView;
    private XMLPullParserSystem parser;
    private List<System> systems;
    private ArrayAdapter<System> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);


}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.system_list_fragment, container, false);
        Log.i("Fragment", "OnCreateView(): View Created");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getView().findViewById(R.id.systemlistview);
        systems = new ArrayList<System>();

        List<System> systems = null;
        try {
            XMLPullParserSystem parser = new XMLPullParserSystem();
            systems = parser.parse(getActivity().getAssets().open("11 Com.xml"));
            Log.i("Parser:", "Assets Opened");
            ArrayAdapter<System> adapter =
                    new ArrayAdapter<System>(this.getActivity(), R.layout.list_item, systems);
            listView.setAdapter(adapter);
            Log.i("Adapter:", "ArrayAdapter Set");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException x) {
            x.printStackTrace();
        }
    }

}
