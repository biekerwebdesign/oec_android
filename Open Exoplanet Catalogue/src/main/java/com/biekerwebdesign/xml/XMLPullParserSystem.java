package com.biekerwebdesign.xml;

/**
 * Created by Bieker on 11/15/13.
 */
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.biekerwebdesign.beans.System;

public class XMLPullParserSystem {
    private static final String ns = null;

    public List<System> parse(InputStream is) throws XmlPullParserException, IOException {
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser parser = factory.newPullParser();
        Log.i("Parser", "Parser created");
        try {
            //factory = XmlPullParserFactory.newInstance();
           // factory.setNamespaceAware(true);
           // parser = factory.newPullParser();

            parser.setInput(is, null);
            parser.nextTag();
            Log.i("System:", "readSystem called");
            return readSystem(parser);
        } finally {
            is.close();
            Log.i("InputStream", "InputStream Closed");
        }
    }
        private List readSystem(XmlPullParser parser) throws XmlPullParserException, IOException {
        List systems = new ArrayList();
            parser.require(XmlPullParser.START_TAG, ns, "system");
            Log.i("Parser", "Passed parser.require");
        String name = parser.getName();
        Log.i("parser", "getName() Called");
        while (parser.next() != XmlPullParser.END_TAG) {
           if (parser.getEventType() != XmlPullParser.START_TAG) {
               Log.i("readSystem", "Start Tag Continue called");
                continue;
           }
            if (name.equalsIgnoreCase("system")) {
                Log.i("String", "System added to parser");
                systems.add(readEntry(parser));
            } else {
               Log.i("String", "No system to add, skipped, no readEntry called");
               skip(parser);
            }

        }
        return systems;
    }

    private System readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
        //TODO Make it return one system per time through, not multiple after every end tag
        parser.require(XmlPullParser.START_TAG, ns, null);
        String systemName = null;
        String rightAscension = null;
        String declination = null;
        String distance = null;
        while (parser.getEventType() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                Log.i("String", "Start Tag Added");
            continue;
            }
        String name = parser.getName();
        if (name.equalsIgnoreCase("name")) {
            Log.i("Name:", "Name added to parser");
            systemName = readName(parser);
        } else if (name.equalsIgnoreCase("rightascension")) {
            Log.i("RAscen:", "Right Ascension added to parser");
            rightAscension = readRightAscension(parser);
        } else if (name.equalsIgnoreCase("declination")) {
            Log.i("Dec:", "Declination added to parser");
            declination = readDeclination(parser);
        } else if (name.equalsIgnoreCase("distance")) {
            Log.i("Distance:", "Distance added to parser");
            distance = readDistance(parser);
        } else {
            Log.i("Skip: ", "String Skipped");
            skip(parser);
        }
    }
        Log.i("Parser", "New System Added to be displayed");
        return new System(systemName, rightAscension, declination, distance);
    }



    //Process name tags in System
    private String readName(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "name");
        String name = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "name");
        Log.i("Name", "Name sent to readText");
        return name;
    }

    //Process Right Ascension in System
    private String readRightAscension(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "rightascension");
        String rightAscension = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "rightascension");
        Log.i("RightAscension", "Right Ascension sent to readText");
        return rightAscension;
    }

    //Process Declination in System
    private String readDeclination(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "declination");
        String declination = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "declination");
        Log.i("Declination", "Declination sent to readText");
        return declination;
    }

    private String readDistance(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "distance");
        String distance = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "distance");
        Log.i("Distance", "Distance sent to readText");
        return distance;
    }

    //For Strings, gets the actual text for all of their values
    private String readText(XmlPullParser parser) throws XmlPullParserException, IOException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            Log.i("Result", "readText activated");
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

    //Skip method, to skip over tags until end
    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
            case XmlPullParser.END_TAG:
                depth--;
                Log.i("Depth", "Depth Incremented -1 Total depth: " + depth);
                break;

            case XmlPullParser.START_TAG:
                depth++;
                Log.i("Depth", "Depth Incremented +1 Total depth: " + depth);
                break;
        }
    }
}
}


