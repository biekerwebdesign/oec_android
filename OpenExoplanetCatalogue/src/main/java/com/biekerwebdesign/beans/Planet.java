package com.biekerwebdesign.beans;

/**
 * Created by Bieker on 11/15/13.
 */


public class Planet {

    //Planet Info
    private String planet;
    private String planetName;
    private String listStatus;//gives the status of Confrimed or not Confrimed planet
    private String planetMass;
    private String planetPeriod;
    private String planetSemiMajorAxis;
    private String planetEccentricity;
    private String planetDiscoveryMethod;//TODO Expand on What abbreviation means
    private String planetLastUpdate;
    private String planetDiscoveryYear;
    private String planetTemp;

    public Planet( String planetName, String listStatus, String planetMass, String planetPeriod, String planetSemiMajorAxis, String planetEccentricity, String planetDiscoveryMethod, String planetLastUpdate, String planetDicoveryYear, String planetTemp) {
        this.planetName = planetName;
        this.listStatus = listStatus;
        this.planetMass = planetMass;
        this.planetPeriod = planetPeriod;
        this.planetSemiMajorAxis = planetSemiMajorAxis;
        this.planetEccentricity = planetEccentricity;
        this.planetDiscoveryMethod = planetDiscoveryMethod;
        this.planetLastUpdate = planetLastUpdate;
        this.planetDiscoveryYear = planetDicoveryYear;
        this.planetTemp = planetTemp;
    }

    public Planet() {
        this.planetName = null;
        this.listStatus = null;
        this.planetMass = null;
        this.planetPeriod = null;
        this.planetSemiMajorAxis = null;
        this.planetEccentricity = null;
        this.planetDiscoveryMethod = null;
        this.planetLastUpdate = null;
        this.planetDiscoveryYear = null;
        this.planetTemp = null;

    }
        public String getPlanet() {
        return planet;
    }
    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getPlanetName() {
        return planetName;
    }
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getListStatus() {
        return listStatus;
    }
    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public String getPlanetMass() {
        return planetMass;
    }
    public void setPlanetMass(String planetMass) {
        this.planetMass = planetMass;
    }

    public String getPlanetPeriod() {
        return planetPeriod;
    }
    public void setPlanetPeriod(String planetPeriod) {
        this.planetPeriod = planetPeriod;
    }

    public String getPlanetSemiMajorAxis() {
        return planetSemiMajorAxis;
    }
    public void setPlanetSemiMajorAxis(String planetSemiMajorAxis) {
        this.planetSemiMajorAxis = planetSemiMajorAxis;
    }

    public String getPlanetEccentricity() {
        return planetEccentricity;
    }
    public void setPlanetEccentricity(String planetEccentricity) {
        this.planetEccentricity = planetEccentricity;
    }

    public String getPlanetDiscoveryMethod() {
        return planetDiscoveryMethod;
    }
    public void setPlanetDiscoveryMethod(String planetDiscoveryMethod) {
        this.planetDiscoveryMethod = planetDiscoveryMethod;
    }

    public String getPlanetDiscoveryYear() {
        return planetDiscoveryYear;
    }
    public void setPlanetDiscoveryYear(String planetDiscoveryYear) {
        this.planetDiscoveryYear = planetDiscoveryYear;
    }

    public String getPlanetLastUpdate() {
        return planetLastUpdate;
    }
    public void setPlanetLastUpdate(String planetLastUpdate) {
        this.planetLastUpdate = planetLastUpdate;
    }

    public String getPlanetTemp() {
        return planetTemp;
    }
    public void setPlanetTemp(String planetTemp) {
        this.planetTemp = planetTemp;
    }

    public String toString() {
        return "Name: " + planetName + "/nMass: " + planetMass + "/n Period: " + planetPeriod + "/n Semimajor Axis: " + planetSemiMajorAxis + "/n Eccentricity: " + planetEccentricity + "/n Temperature: " + planetTemp + "/n Status: " + listStatus + "/n Dicovery Method: " + planetDiscoveryMethod + "/n Discovery Year: " + planetDiscoveryYear + "/n Last Update: " + planetLastUpdate;
    }
}

