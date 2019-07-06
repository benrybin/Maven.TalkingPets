package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class PetTest {
 Pet test = new Cat("Steve");
    @Test
    public void testName() {


    String expected = "Steve";

    // When
    String actual = test.getName();

    // Then
        Assert.assertEquals(expected,actual);
}
}
