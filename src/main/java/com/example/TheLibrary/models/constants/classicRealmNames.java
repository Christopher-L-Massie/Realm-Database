package com.example.TheLibrary.models.constants;

public enum classicRealmNames {

    //|||Values|||

    ASHKANDI,
    ATIESH,
    AZURESONG,
    MANKRIK,
    MYZRAEL,
    OLD_BLANCHY,
    PAGLE,
    WESTFALL,
    WINDSEEKER,
    BENEDICITION,
    BIGGLESWORTH,
    BLAUMEUX,
    FAERLINA,
    FAIRBANKS,
    HEROD,
    INCENDIUS,
    KIRTONOS,
    KURINAXX,
    KROMCRUSH,
    RATTLEGORE,
    SKERAM,
    SMOLDERWEB,
    STALAGG,
    SULFURAS,
    THALNOS,
    THUNDERFURY,
    WHITEMANE,
    BLOODSAIL_BUCCANEERS,
    DEVIATE_DELIGHT,
    GROBBULUS,
    ARUGAL,
    FELSTRIKER,
    REMULOS,
    YOJAMBA;

    //|||Properties||
    private String name;
    private String timeZone;
    private String region;
    private String type;

    ///|||Constructors|||

    classicRealmNames(String name, String timeZone, String region, String type){
        this.name = name;
        this.timeZone = timeZone;
        this.region = region;
        this.type = type;
    }


}
