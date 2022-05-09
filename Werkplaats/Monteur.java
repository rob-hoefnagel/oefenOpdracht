package Werkplaats;

import java.util.Scanner;

public class Monteur {
    boolean nakijken(boolean kapot) {
        System.out.println("Wil jij je fiets laten nakijken? y/n");
        Scanner x = new Scanner(System.in);
        String antwoord = x.nextLine();
        if (antwoord.equals("y")){
            System.out.println("we gaan het voor je nakijken");
            if(kapot){
                System.out.println("Je fiets is kapot");
                return true;
            } else {
                System.out.println("Niks aan de hand");
            }
        } else {
            System.out.println("fijne dag");
        }
        return false;
    }

}
