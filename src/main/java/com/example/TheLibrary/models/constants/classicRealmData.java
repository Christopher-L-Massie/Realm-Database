package com.example.TheLibrary.models.constants;

public enum classicRealmData {

    //|||Values|||

    //Americas & Oceania

    ANATHEMA("ANATHEMA","PvP","Medium","PST","United States"),
    ARCANITEREAPER("Arcanite Reaper","PvP","Medium","PST","United States"),
    ARUGAL("Arugal","PvP","High","AEDT","United States"),
    ASHKANDI("Ashkandi","PvE","Medium","EST","United States"),
    ATIESH("Atiesh","PvE","High","PST","United States"),
    AZURESONG("Azuresong","PvE","Medium","PST","United States"),
    BENEDICTION("Benediction","PvP","High","EST","United States"),
    BIGGLESWORTH("Bigglesworth","PvP","High","PST","United States"),
    BLAUMEUX("Blaumeux","PvP","Medium","PST","United States"),
    BLOODSAILBUCCANEERS("Bloodsail Buccaneers","RP","Medium","EST","United States"),
    DEVIATEDELIGHT("Deviate Delight","PvP RP","Medium","EST","United States"),
    EARTHFURY("Earthfury","PvP","Medium","EST","United States"),
    FAERLINA("Faerlina","PvP","High","EST","United States"),
    FAIRBANKS("Fairbanks","PvP","High","PST","United States"),
    FELSTRIKER("Felstriker","PvP","Low","AEDT","United States"),
    GROBBULUS("Grobbulus","PvP RP","High","PST","United States"),
    HEARTSEEKER("Heartseeker","PvP","Medium","EST","United States"),
    HEROD("Herod","PvP","High","EST","United States"),
    INCENDIUS("Incendius",)



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
