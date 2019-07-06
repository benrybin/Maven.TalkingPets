package io.zipcoder.polymorphism;

public class Dog extends Pet {


    public Dog(String petName) {

        setName(petName);

    }
    public String getname(){
        return getName();
    }
    public String speak(){


        return "Bark";
    }
}
