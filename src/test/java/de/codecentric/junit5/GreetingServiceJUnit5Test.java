package de.codecentric.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceJUnit5Test {

    private GreetingService service;

    @BeforeEach
    void setUp() {
        service = new GreetingService();
    }

    @Test
    void should_greet_world() {
        assertEquals("Hello, World!", service.getGreeting(null));
    }

    @Test
    void should_greet_peter() {
        assertEquals("Hello, Peter!", service.getGreeting("Peter"));
    }
}
