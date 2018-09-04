package de.codecentric.junit5;

public class GreetingService {

    public String getGreeting(String who) {
        if (who == null) {
            return "Hello, World!";
        }
        return "Hello, " + who + "!";
    }
}
