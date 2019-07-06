package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class CatTest {
    Cat test = new Cat("Sam");

    @Test
    public void getname() {


        String expected = "Sam";

        // When
        String actual =test.getname() ;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        String expected = "Meow";

        // When
        String actual =test.speak() ;

        // Then
        Assert.assertEquals(expected, actual);
    }
}
