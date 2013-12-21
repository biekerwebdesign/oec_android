package com.biekerwebdesign.xml;

import android.util.Log;

import com.biekerwebdesign.beans.*;
import com.biekerwebdesign.beans.Star;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bieker on 12/10/13.
 */
public class XMLPullParserStar {
    private static final String ns = null;

    public List<Star> parse(InputStream is) throws XmlPullParserException, IOException {
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser parser = factory.newPullParser();
        Log.i("Parser", "Parser created");
        try {
            //factory = XmlPullParserFactory.newInstance();
            // factory.setNamespaceAware(true);
            // parser = factory.newPullParser();

            parser.setInput(is, null);
            //TODO Make the parse method check to make sure it is a star tag before continuing
            parser.nextTag();
            Log.i("Star:", "readStar called");
            return readStar(parser);
        } finally {
            is.close();
            Log.i("InputStream", "InputStream Closed");
        }
    }
    private List readStar(XmlPullParser parser) throws XmlPullParserException, IOException {
        List stars = new ArrayList();
        parser.require(XmlPullParser.START_TAG, ns, "star");
        Log.i("Parser", "Passed parser.require");
        //String name = parser.getName();
        Log.i("parser", "getName() Called");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                Log.i("readStar", "Start Tag Continue called");
                continue;
            }
            String name = parser.getName();
            if (name.equalsIgnoreCase("star")) {
                Log.i("String", "Star added to parser");
                stars.add(readEntry(parser));
            } else {
                Log.i("String", "No star to add, skipped, no readEntry called");
                skip(parser);
            }

        }
        return stars;
    }

    private Star readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
        //TODO Make it return one star per time through, not multiple after every end tag
        parser.require(XmlPullParser.START_TAG, ns, null);
        String starName = null;
        String starMass = null;
        String starRadius = null;
        String starMagV = null;
        String starMagB = null;
        String starMagJ = null;
        String starMagH = null;
        String starMagK = null;
        String starMetallicity = null;
        String starSpectralType = null;
        String starTemp = null;
        while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
        while (parser.getEventType() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                Log.i("String", "Start Tag Added");
                continue;
            }
            String name = parser.getName();
            if (name.equalsIgnoreCase("name")) {
                Log.i("Name:", "Name added to parser");
                starName = readName(parser);
            } else if (name.equalsIgnoreCase("mass")) {
                Log.i("StarMass:", "StarMass added to parser");
                starMass = readStarMass(parser);
            } else if (name.equalsIgnoreCase("radius")) {
                Log.i("StarRadius:", "StarRadius added to parser");
                starRadius = readStarRadius(parser);
            } else if (name.equalsIgnoreCase("spectraltype")) {
                Log.i("SpectralType:", "SpectralType added to parser");
                starSpectralType = readStarSpectralType(parser);
            } else if (name.equalsIgnoreCase("metallicity")) {
                Log.i("Metallicity:", "Metallicity added to parser");
                starMetallicity = readStarMetallicity(parser);
            } else if (name.equalsIgnoreCase("temperature")) {
                Log.i("StarTemp:", "StarTemp added to parser");
                starTemp = readStarTemp(parser);
            } else if (name.equalsIgnoreCase("magV")) {
                Log.i("MagV:", "MagV added to parser");
                starMagV = readStarMagV(parser);
            } else if (name.equalsIgnoreCase("magK")) {
                Log.i("MagK:", "MagK added to parser");
                starMagK = readStarMagK(parser);
            } else if (name.equalsIgnoreCase("magJ")) {
                Log.i("MagJ:", "MagJ added to parser");
                starMagJ = readStarMagJ(parser);
            } else if (name.equalsIgnoreCase("magH")) {
                Log.i("MagH:", "MagH added to parser");
                starMagH = readStarMagH(parser);
            } else if (name.equalsIgnoreCase("magB")) {
                Log.i("MagB:", "MagB added to parser");
                starMagB = readStarMagB(parser);
            } else {
                Log.i("Skip: ", "String Skipped");
                skip(parser);
            }
        }
        Log.i("Parser", "New Star Added to be displayed");
        //return new Star(starName, starMass, starRadius, starMagV, starMagB, starMagJ, starMagH, starMagK, starMetallicity, starSpectralType, starTemp);
    }
        return new Star(starName, starMass, starRadius, starMagV, starMagB, starMagJ, starMagH, starMagK, starMetallicity, starSpectralType, starTemp);
    }

    private String readStarMagB(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "magB");
        String starMagB = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "magB");
        Log.i("Star Mag B", "Star Mag B sent to readText");
        return starMagB;
    }

    private String readStarMagH(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "magH");
        String starMagH = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "magH");
        Log.i("Star Mag H", "Star Mag H sent to readText");
        return starMagH;
    }

    private String readStarMagJ(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "magJ");
        String starMagJ = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "magJ");
        Log.i("Star Mag J", "Star Mag J sent to readText");
        return starMagJ;
    }

    private String readStarMagK(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "magK");
        String starMagK = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "magK");
        Log.i("Star Mag K", "Star Mag K sent to readText");
        return starMagK;
    }

    private String readStarMagV(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "magV");
        String starMagV = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "magV");
        Log.i("Star MagV", "Star MagV sent to readText");
        return starMagV;
    }

    private String readStarTemp(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "temperature");
        String starTemp = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "temperature");
        Log.i("Star Temp", "Star Temp sent to readText");
        return starTemp;
    }

    private String readStarMetallicity(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "metallicity");
        String starMetallicity = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "metallicity");
        Log.i("Star Metallicity", "Star Metallicity sent to readText");
        return starMetallicity;
    }

    //Process name tags in Star
    private String readName(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "name");
        String name = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "name");
        Log.i("Name", "Name sent to readText");
        return name;
    }

    //Process Right Ascension in Star
    private String readStarMass(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "mass");
        String starMass = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "mass");
        Log.i("StarMass", "Star Mass sent to readText");
        return starMass;
    }

    //Process Declination in Star
    private String readStarRadius(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "radius");
        String starRadius = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "radius");
        Log.i("Star Radius", "Star Radius sent to readText");
        return starRadius;
    }

    private String readStarSpectralType(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "spectraltype");
        String starSpectralType = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "spectraltype");
        Log.i("Spectral Type", "Star Spectral Type sent to readText");
        return starSpectralType;
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
