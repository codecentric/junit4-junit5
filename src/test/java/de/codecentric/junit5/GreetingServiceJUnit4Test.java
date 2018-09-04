package de.codecentric.junit5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingServiceJUnit4Test {

    private GreetingService service;

    @Before
    public void setUp() {
        service = new GreetingService();
    }

    @Test
    public void should_greet_world() {
        assertEquals("Hello, World!", service.getGreeting(null));
    }

    @Test
    public void should_greet_peter() {
        assertEquals("Hello, Peter!", service.getGreeting("Peter"));
    }
}
