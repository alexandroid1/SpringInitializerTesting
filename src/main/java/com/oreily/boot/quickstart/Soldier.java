package com.oreily.boot.quickstart;

/**
 * Created by Александр on 12.07.2017.
 */
public class Soldier {

    public String name;

    public Integer numberOfBattles;

    // for JSON using
    public Soldier(){
    }

    public Soldier(String name, Integer numberOfBattles) {
        this.name = name;
        this.numberOfBattles = numberOfBattles;
    }
}
