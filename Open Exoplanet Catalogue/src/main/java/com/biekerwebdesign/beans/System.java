package com.biekerwebdesign.beans;

/**
 * Created by Bieker on 11/15/13.
 */
public class System {
    //System info
    private String systemName;
    private String rightAscension;
    private String declination;
    private String distance;

    //Link Info

    public System(String systemName, String rightAscension, String declination, String distance) {
        this.systemName = systemName;
        this.rightAscension = rightAscension;
        this.declination = declination;
        this.distance = distance;
    }

    public System() {
    }

   /*
    * System Getters and Setters
    */

    public String getSystemName() {
        return systemName;
    }
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getRightAscension() {
        return rightAscension;
    }
    public void setRightAscension(String rightAscension) {
        this.rightAscension = rightAscension;
    }

    public String getDeclination() {
        return declination;
    }

    public void setDeclination(String declination) {
        this.declination = declination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String toString() {
       StringBuilder builder = new StringBuilder();
        if (systemName == null && rightAscension == null && declination == null && distance == null) {
            return "";
        }
        if (systemName != null) {
            builder.append(" System Name: ");
            builder.append(systemName);
            builder.append("\n");
        }
        if (rightAscension != null) {
            builder.append(" Right Ascension: ");
            builder.append(rightAscension);
            builder.append("\n");
        }
        if (declination != null) {
            builder.append(" Declination: ");
            builder.append(declination);
            builder.append("\n");
        }
        if (distance != null) {
            builder.append(" Distance: ");
            builder.append(distance);
            builder.append("\n");
        }
            return builder.toString().substring(1);
    }

}

