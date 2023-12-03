package LambdaCollection;

import java.util.List;
import java.util.function.Consumer;

// # Lambda Collection
//   - When the Lambda feature came out in Java 8,
//     there were a lot of default methods added to the Java 'Collection'.
//   - Some have default methods that make extensive use of Lambda features.
//   - In this material we will discuss several methods that utilize Lambda.
//
public class ForEachApp {
  public static void main(String[] args) {
    List<String> list = List.of("August", "De", "Caprio");

    // for loop
    System.out.println("# For Loop");
    for (var value: list) {
      System.out.println(value);
    }

    // for each anonymous class
    System.out.println("\n# For Each Anonymous Class");
    list.forEach(new Consumer<String>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    });

    // lambda
    System.out.println("\n# Lambda");
    list.forEach(value -> System.out.println(value));

    // lambda method reference
    System.out.println("\n# Lambda Method Reference");
    list.forEach(System.out::println);
  }
}
