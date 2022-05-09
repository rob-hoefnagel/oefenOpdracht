package Werkplaats;


import java.util.Random;

public class Fiets {
    Random v = new Random();
    boolean kapot;
    boolean wiel = v.nextBoolean();
    boolean stuur= v.nextBoolean();
    boolean remmen= v.nextBoolean();
    boolean versnellingen = v.nextBoolean();
    Boolean[] onderdelen = {wiel,stuur,remmen,versnellingen};
    String[] onderdelen2 = {"wiel", "stuur", "remmen", "versnellingen"};

    void fietsOnderdelen(){
        for (int i = 0; i< onderdelen.length; i++){
            if(!onderdelen[i]){
                System.out.println(onderdelen2[i] + " is kapot");
            }
        }
    }
}

