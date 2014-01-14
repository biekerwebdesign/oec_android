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
        StringBuilder builder = new StringBuilder();
        if (planetName == null && listStatus == null && planetMass == null && planetPeriod == null && planetSemiMajorAxis == null && planetEccentricity == null && planetDiscoveryMethod == null && planetLastUpdate == null && planetDiscoveryYear == null && planetTemp == null) {
            return "";
        }
        if(planetName != null) {
            builder.append(" Planet Name:");
            builder.append(planetName);
            builder.append("\n");
        }
        if(listStatus != null) {
            builder.append(" Status:");
            builder.append(listStatus);
            builder.append("\n");
        }
        if(planetLastUpdate != null) {
            builder.append(" Last Update:");
            builder.append(planetLastUpdate);
            builder.append("\n");
        }
        if(planetDiscoveryYear != null) {
            builder.append(" Discovery Year:");
            builder.append(planetDiscoveryYear);
            builder.append("\n");
        }
        if(planetDiscoveryMethod != null) {
            builder.append(" Discovery Method:");
            builder.append(planetDiscoveryMethod);
            builder.append("\n");
        }
        if(planetMass != null) {
            builder.append(" Mass:");
            builder.append(planetMass);
            builder.append("\n");
        }
        if(planetPeriod != null) {
            builder.append(" Period:");
            builder.append(planetPeriod);
            builder.append("\n");
        }
        if(planetTemp != null) {
            builder.append(" Temperature:");
            builder.append(planetTemp);
            builder.append("\n");
        }
        if(planetEccentricity != null) {
            builder.append(" Eccentricity:");
            builder.append(planetEccentricity);
            builder.append("\n");
        }
        if(planetSemiMajorAxis != null) {
            builder.append(" Semi-Major Axis:");
            builder.append(planetSemiMajorAxis);
            builder.append("\n");
        }
        return builder.toString().substring(1);
    }
}

