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
        return "Star Name: " + starName + "/n Mass: " + starMass + "/n Radius: " + starRadius + "/n Mag V: " + starMagV + "/n Mag B: " + starMagB + "/n Mag H: " + starMagH + "/n Mag J: " + starMagJ + "/n Mag K: " + starMagK + "/n Metallicity: " + starMetallicity + "/n Spectral Type: " + starSpectralType + "/n Temperature: " + starTemp;
    }
}

