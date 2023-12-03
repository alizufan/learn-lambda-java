package LambdaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// # Lambda Collection
//   - When the Lambda feature came out in Java 8,
//     there were a lot of default methods added to the Java 'Collection'.
//   - Some have default methods that make extensive use of Lambda features.
//   - In this material we will discuss several methods that utilize Lambda.
//
public class RemoveIfApp {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.addAll(List.of("August", "De", "Caprio"));

    // for loop: Error -> ConcurrentModificationException
    // System.out.println("# Remove Manually");
    // for (var value: list) {
    //   if(value.length() > 5) {
    //     list.remove(value);
    //   }
    // }

    // remove if anonymous class
    System.out.println("\n# Remove If Anonymous Class");
    list.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return value.length() > 5;
      }
    });

    // lambda
    System.out.println("\n# Remove If Lambda");
    list.removeIf(value -> value.length() > 5);

    System.out.println(list);
  }
}
