package com.biekerwebdesign.openexoplanetcatalogue;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.biekerwebdesign.beans.*;
import com.biekerwebdesign.beans.System;
import com.biekerwebdesign.xml.XMLPullParserPlanet;
import com.biekerwebdesign.xml.XMLPullParserSystem;

import java.util.List;

/**
 * Created by Jacob on 1/9/14.
 */
public class PlanetActivity extends Activity {

    private ListView listView;
    private XMLPullParserPlanet parser;
    private List<System> systems;
    private ArrayAdapter<System> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

        if (findViewById(R.id.first_container) != null && findViewById(R.id.second_container) != null) {
            if (savedInstanceState == null) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.first_container, new StarFragment());
                fragmentTransaction.add(R.id.second_container, new PlanetFragment());
                fragmentTransaction.commit();
            }
        } else if (findViewById(R.id.first_container) != null) {
            if (savedInstanceState == null) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.first_container, new PlanetFragment());
                fragmentTransaction.commit();
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
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


}
