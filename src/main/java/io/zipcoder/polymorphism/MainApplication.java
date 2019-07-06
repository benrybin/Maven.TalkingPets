package io.zipcoder.polymorphism;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args){
        Scanner mainScanner = new Scanner(System.in);
        Map<String,String> petHolder = new HashMap<String, String>();

        System.out.println("Please enter number of pets");
        Integer numOfPets = mainScanner.nextInt();
        Integer count = 0;
        while(count < numOfPets){
            System.out.println("Please name your pet");
            String nameofPet = mainScanner.nextLine();
            System.out.println("What type of animal?");
            String typeofPet = mainScanner.nextLine();
            count++;
            petHolder.put(nameofPet,typeofPet);




        }
        mainScanner.toString();

    }
}
