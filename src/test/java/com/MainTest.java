package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testHelloWorld() {
        String message = "Hello, Maven!";
        assertEquals("Hello, Maven!", message);
    }
}

