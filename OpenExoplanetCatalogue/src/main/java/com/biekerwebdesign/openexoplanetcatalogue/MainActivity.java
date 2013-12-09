package com.biekerwebdesign.openexoplanetcatalogue;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.List;
import java.util.ArrayList;

import com.biekerwebdesign.beans.System;
import com.biekerwebdesign.xml.XMLPullParserSystem;
import android.util.Log;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class MainActivity extends Activity {

    private ListView listView;
    private XMLPullParserSystem parser;
    private List<System> systems;
    private ArrayAdapter<System> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.system_container, new SystemFragment());
            fragmentTransaction.commit();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

/*    @Override
       public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/

}
