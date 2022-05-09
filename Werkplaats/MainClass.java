package Werkplaats;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Klant pien = new Klant();
        Random y = new Random();
        pien.gazelle.kapot = y.nextBoolean();
        Monteur harry = new Monteur();
        harry.nakijken(pien.gazelle.kapot);
        if(harry.nakijken(pien.gazelle.kapot)){
        pien.gazelle.fietsOnderdelen();
        }


    }
}



