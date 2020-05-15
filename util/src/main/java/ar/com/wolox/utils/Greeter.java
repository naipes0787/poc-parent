package ar.com.wolox.utils;

import java.util.Optional;

public class Greeter {

    private static final String DEFAULT_NAME = "World";

    /**
     * Say hello to the <code>name</code>, if <code>name</code> is null there is a default
     * value
     *
     * @param name {@link String}
     * @return {@link String} with the welcome message
     */
    public static String sayHello(String name) {
        return "Hello, "
                .concat(Optional.ofNullable(name)
                        .orElse(DEFAULT_NAME))
                .concat("!");
    }

    /**
     * Say goodbye to the <code>name</code>, if <code>name</code> is null there is a default
     * value
     *
     * @param name {@link String}
     * @return {@link String} with the goodbye message
     */
    public static String sayGoodbye(String name) {
        return "Goodbye, "
                .concat(Optional.ofNullable(name)
                        .orElse(DEFAULT_NAME))
                .concat("!");
    }

}
