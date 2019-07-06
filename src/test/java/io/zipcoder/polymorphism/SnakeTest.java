package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {
    Snake test = new Snake("Ben");
    @Test
    public void getname() {

        String expected = "Ben";

        // When
        String actual =test.getname() ;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        String expected = "ZZZZzzz";

        // When
        String actual =test.speak() ;

        // Then
        Assert.assertEquals(expected, actual);
    }
}