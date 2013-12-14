package com.biekerwebdesign.beans;

/**
 * Created by Bieker on 11/15/13.
 */
public class Star {

    //Star Info
    private String starName;
    private String starMass;
    private String starRadius;
    private String starMagV;
    //TODO Add support for plus or minus error in measurement
    private String starMagB;
    private String starMagJ;
    private String starMagH;
    private String starMagK;
    private String starMetallicity;
    private String starSpectralType;
    private String starTemp;


    public Star(String starName, String starMass, String starRadius, String starMagV, String starMagB, String starMagJ, String starMagH, String starMagK, String starMetallicity, String starSpectralType, String starTemp) {
        this.starName = starName;
        this.starMass = starMass;
        this.starRadius = starRadius;
        this.starMagV = starMagV;
        this.starMagB = starMagB;
        this.starMagJ = starMagJ;
        this.starMagH = starMagH;
        this.starMagK = starMagK;
        this.starMetallicity = starMetallicity;
        this.starSpectralType = starSpectralType;
        this.starTemp = starTemp;
    }

    public Star() {
        this.starName = null;
        this.starMass = null;
        this.starRadius = null;
        this.starMagV = null;
        this.starMagB = null;
        this.starMagJ = null;
        this.starMagH = null;
        this.starMagK = null;
        this.starMetallicity = null;
        this.starSpectralType = null;
        this.starTemp = null;
    }
	   /*
	    * Star Getters and Setters
	    */

    public String getStarName() {
        return starName;
    }
    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getStarMass() {
        return starMass;
    }
    public void setStarMass(String starMass) {
        this.starMass = starMass;
    }

    public String getStarRadius() {
        return starRadius;
    }
    public void setStarRadius(String starRadius) {
        this.starRadius = starRadius;
    }

    //Star magnitude Setter and Getters

    public String getStarMagV() {
        return starMagV;
    }
    public void setStarMagV(String starMagV) {
        this.starMagV = starMagV;
    }

    public String getStarMagB() {
        return starMagB;
    }
    public void setStarMagB(String starMagB){
        this.starMagB = starMagB;
    }

    public String getStarMagH() {
        return starMagH;
    }
    public void setStarMagH(String starMagH){
        this.starMagH = starMagH;
    }

    public String getStarMagJ() {
        return starMagJ;
    }
    public void setStarMagJ(String starMagJ){
        this.starMagJ = starMagJ;
    }

    public String getStarMagK() {
        return starMagK;
    }
    public void setStarMagK(String starMagK){
        this.starMagK = starMagK;
    }

    public String getStarMetallicity() {
        return starMetallicity;
    }
    public void setStarMetallicity(String starMetallicity) {
        this.starMetallicity = starMetallicity;
    }

    public String getStarSpectralType() {
        return starSpectralType;
    }
    public void setStarSpectralType(String starSpectralType) {
        this.starSpectralType = starSpectralType;
    }

    public String getStarTemp() {
        return starTemp;
    }
    public void setStarTemp(String starTemp) {
        this.starTemp = starTemp;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (starName == null && starMass == null && starRadius == null && starMagV == null && starMagB == null && starMagJ == null && starMagH == null && starMagK == null && starMetallicity == null && starSpectralType == null && starTemp == null) {
            return "";
        }

        if (starName != null) {
            builder.append(" Star Name: ");
            builder.append(starName);
            builder.append("\n");
        }
        if (starMass!= null) {
            builder.append(" Mass: ");
            builder.append(starMass);
            builder.append("\n");
        }
        if (starRadius != null) {
            builder.append(" Radius: ");
            builder.append(starName);
            builder.append("\n");
        }
        if (starMetallicity != null) {
            builder.append(" Metallicity: ");
            builder.append(starMetallicity);
            builder.append("\n");
        }
        if (starSpectralType!= null) {
            builder.append(" Spectral Type: ");
            builder.append(starSpectralType);
            builder.append("\n");
        }
        if (starTemp != null) {
            builder.append(" Temperature: ");
            builder.append(starTemp);
            builder.append("\n");
        }
        if (starMagV != null) {
            builder.append(" Mag V: ");
            builder.append(starMagV);
            builder.append("\n");
        }
        if (starMagB != null) {
            builder.append(" Mag B: ");
            builder.append(starMagB);
            builder.append("\n");
        }
        if (starMagH != null) {
            builder.append(" Mag H: ");
            builder.append(starMagH);
            builder.append("\n");
        }
        if (starMagJ != null) {
            builder.append(" Mag J: ");
            builder.append(starMagJ);
            builder.append("\n");
        }
        if (starMagK != null) {
            builder.append(" Mag K: ");
            builder.append(starMagK);
            builder.append("\n");
        }
        return builder.toString().substring(1);

    }

}

