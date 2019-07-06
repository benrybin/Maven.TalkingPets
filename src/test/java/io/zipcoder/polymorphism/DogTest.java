package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog test = new Dog("John");
    @Test
    public void getname() {

        String expected = "John";

        // When
        String actual =test.getname() ;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        String expected = "Bark";

        // When
        String actual =test.speak() ;

        // Then
        Assert.assertEquals(expected, actual);
    }
}