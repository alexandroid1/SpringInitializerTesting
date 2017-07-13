package com.oreily.boot.quickstart;

import java.util.Date;

/**
 * Created by Александр on 12.07.2017.
 */
public class Soldier {

    public String name;

    public Integer numberOfBattles;

    public Date joined;

    // for JSON using
    public Soldier(){
    }

    public Soldier(String name, Integer numberOfBattles) {
        this.name = name;
        this.numberOfBattles = numberOfBattles;
    }

}
