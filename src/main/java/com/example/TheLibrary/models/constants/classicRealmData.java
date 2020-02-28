package com.example.TheLibrary.models.constants;

public enum classicRealmData {

    //|||Values|||

    //Americas & Oceania

    ANATHEMA("ANATHEMA"),
    ARCANITEREAPER,
    ARUGAL


    //|||Properties||
    private String name;
    private String timeZone;
    private String region;
    private String type;
    private String population;
    private String locale;

    ///|||Constructors|||

    classicRealmData(String name, String type, String population, String timeZone, String locale){
        this.name = name;
        this.timeZone = timeZone;
        this.region = region;
        this.type = type;
        this.population = population;
        this.locale = locale;
    }

    //|||Accessors|||

    public String getName() {
        return name;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }
}
