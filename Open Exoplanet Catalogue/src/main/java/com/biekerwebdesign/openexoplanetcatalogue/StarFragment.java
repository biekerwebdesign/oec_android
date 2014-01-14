package com.biekerwebdesign.openexoplanetcatalogue;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.biekerwebdesign.beans.*;
import com.biekerwebdesign.beans.System;
import com.biekerwebdesign.xml.XMLPullParserStar;
import com.biekerwebdesign.xml.XMLPullParserSystem;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bieker on 12/6/13.
 */
public class StarFragment extends ListFragment {

    private ListView listView;
    private XMLPullParserStar parser;
    private List<Star> stars;
    private ArrayAdapter<Star> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.star_list_fragment, container, false);
        Log.i("Fragment", "OnCreateView(): Star View Created");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getView().findViewById(android.R.id.list); //Should be the list in star_list_fragment
        stars = new ArrayList<Star>();

        List<Star> stars = null;
        try {
            XMLPullParserStar parser = new XMLPullParserStar();
            stars = parser.parse(getActivity().getAssets().open("11 Com.xml"));
            Log.i("Parser:", "Star Assets Opened");
            ArrayAdapter<Star> adapter =
                    new ArrayAdapter<Star>(this.getActivity(), R.layout.list_item, stars);
            listView.setAdapter(adapter);
            Log.i("Adapter:", "Star ArrayAdapter Set");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException x) {
            x.printStackTrace();
        }
    }

    public void onListItemClicked(ListView l, View v, int position, long id) {
        //TODO Call to create Planet Fragment when Item clicked
        super.onListItemClick(l, v, position, id);
    }
}
