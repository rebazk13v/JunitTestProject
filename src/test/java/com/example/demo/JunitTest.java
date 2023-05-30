package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTest {

    @Test
    public void testAdd() {
        MyFunctionTest myFunction = new MyFunctionTest();
        int result = myFunction.add(2, 3);
        assertEquals(5, result);
    }

    // Add more test methods for other functions or scenarios as needed
}
