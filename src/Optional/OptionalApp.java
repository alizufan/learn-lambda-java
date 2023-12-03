package Optional;

import java.util.Optional;

// # Optional
//   - In Java 8, Java provides a new class called 'Optional' which is in the java.util package.
//   - This class is used as a wrapper for values that can be null.
//   - 'Optional' is designed to make it easier for us when operating with objects that can be null.
//   - Because 'NullPointerException' is one of the things that Java Programmers often encounter.
//
public class OptionalApp {
    public static void main(String[] args) {
        // sayHi("August");
        // Error -> NullPointerException
        // sayHi(null);

        sayHello("August");
        sayHello(null);
    }

    // # No Null Checking
    public static void sayHi(String name) {
        String nameUp = name.toUpperCase();
        System.out.println("Hi " + nameUp);
    }

    // # Optional
    public static void sayHello(String name) {
        // # Check Manually
        // if (name != null) {
        //     String upName = name.toUpperCase();
        //     System.out.println("Hello " + upName);
        // }

        // # In Separation Of Operations
        // Optional<String> opName = Optional.ofNullable(name);

        //  - Lambda
        // Optional<String> opNameUp = opName.map(value -> value.toUpperCase());

        //  - Lambda Method Reference
        // Optional<String> opNameUp = opName.map(String::toUpperCase);
        // opNameUp.ifPresent((value) -> System.out.println("Hello " + value));

        // # In One Line
        // Optional.ofNullable(name)
        //         .map(String::toUpperCase)
        //         .ifPresent(value -> System.out.println("Hello " + value));

        // # In One Line And Else
        // Optional.ofNullable(name)
        //         .map(String::toUpperCase)
        //         .ifPresentOrElse(
        //                 value -> System.out.println("Hello " + value),
        //                 () -> System.out.println("Hello")
        //          );

        String upName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("FRIEND");

        System.out.println("Hello " + upName);
    }
}
