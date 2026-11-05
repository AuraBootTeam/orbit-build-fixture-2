package dev.orbit.fixture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreeterTest {
    private final Greeter greeter = new Greeter();

    @Test
    void greetsTheRouteAContract() {
        assertEquals("orbit-route-a", greeter.greet());
    }

    @Test
    void greetingIsNonEmpty() {
        assertTrue(!greeter.greet().isEmpty());
    }
}
