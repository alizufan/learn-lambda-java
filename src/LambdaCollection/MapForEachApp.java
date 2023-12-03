package LambdaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// # Lambda Collection
//   - When the Lambda feature came out in Java 8,
//     there were a lot of default methods added to the Java 'Collection'.
//   - Some have default methods that make extensive use of Lambda features.
//   - In this material we will discuss several methods that utilize Lambda.
//
public class MapForEachApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("first", "August");
    map.put("middle", "De");
    map.put("last", "Caprio");

    System.out.println("# For Loop");
    for(var entry: map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }

    System.out.println("\n# For Each Anonymous Class");
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println("Key: " + key + " Value: " + value);
      }
    });

    System.out.println("\n# For Each Lambda");
    map.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

  }
}
