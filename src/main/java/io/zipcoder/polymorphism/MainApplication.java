package io.zipcoder.polymorphism;

import java.util.*;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args){
        Scanner mainScanner = new Scanner(System.in);
        List<Pet> petHolder = new ArrayList<Pet>();

        System.out.println("Please enter number of pets");
        Integer numOfPets = mainScanner.nextInt();
        mainScanner.nextLine();
        Integer count = 0;
        while(count < numOfPets){
            String nameofPet = "";
            String typeofPet ="";

            System.out.println("\nPlease name your pet:");
             nameofPet = mainScanner.nextLine();

            System.out.println("\nWhat type of animal?");
            typeofPet = mainScanner.nextLine();

            Pet temp;
            if(typeofPet.toUpperCase() == "CAT"){
                temp = new Cat(nameofPet);
                petHolder.add(temp);
            }
            else if(typeofPet.toUpperCase() == "DOG"){
                temp = new Dog(nameofPet);
                petHolder.add(temp);

            }else {
                temp = new Snake(nameofPet);
                petHolder.add(temp);
            }


            count++;


        }
        for (int i = 0; i <petHolder.size() ; i++) {


            System.out.println(petHolder.get(i).getName());
        }

    }
}
