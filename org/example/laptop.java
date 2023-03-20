package org.example;

import java.util.function.Predicate;

public class laptop {
    public String ID;
    public String Name;
    public Integer RAM; 
    public Integer HDD;
    public String OS;
    public String Color;

    public laptop(String str) {
        var data = str.split(" ");
        ID = data[0];
        Name = data[1];
        RAM = Integer.parseInt(data[2]);
        HDD = Integer.parseInt(data[3]);
        OS = data[4];
        Color = data[5];
    }

    public String toString(){
        return ID + " " + Name + " " + RAM + " " +  HDD + " " +  OS + " " +  Color;
    }
}
