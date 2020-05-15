package ar.com.wolox;

import ar.com.wolox.utils.Greeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for the Greeter
 */
public class GreeterTest {

    @Test
    public void whenNameIsUsed_WelcomeMessageWithName() {
        assertEquals("Hello, Pedro!", Greeter.sayHello("Pedro"));
    }

    @Test
    public void whenNameIsUsed_GoodbyeMessageWithName() {
        assertEquals("Goodbye, Pedro!", Greeter.sayGoodbye("Pedro"));
    }

    @Test
    public void whenNameIsNull_WelcomeMessageWithName() {
        assertEquals("Hello, World!", Greeter.sayHello(null));
    }

    @Test
    public void whenNameIsNull_GoodbyeMessageWithName() {
        assertEquals("Goodbye, World!", Greeter.sayGoodbye(null));
    }

}
