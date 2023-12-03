package MethodReference;

import java.util.function.Function;
import java.util.function.Predicate;

// # Method Reference
//   - Sometimes when creating a lambda,
//     the contents of the lambda only access other methods or access methods in
//     the lambda method parameters.
//   - We can shorten the creation of the lambda with a reference method.
//
public class MethodReferenceApp {
  public static void main(String[] args) {

    // Predicate<String> predicate = new Predicate<String>() {
    //   @Override
    //   public boolean test(String s) {
    //     return StringUtility.isLowerCase(s);
    //   }
    // };
    //
    // Predicate<String> predicate = value -> StringUtility.isLowerCase(value);

    // # Method Reference Static
    Predicate<String> predicate = StringUtility::isLowerCase;

    System.out.println(predicate.test("August"));
    System.out.println(predicate.test("august"));

    // # Method Reference Paramater
    // Function<String, String> functionUpper = new Function<String, String>() {
    //   @Override
    //   public String apply(String value) {
    //     return value.toUpperCase();
    //   }
    // };
    //
    // Function<String, String> functionUpper = value -> value.toUpperCase();
    //
    Function<String, String> functionUpper = String::toUpperCase;
    System.out.println(functionUpper.apply("august"));

  }

  public void run() {
    // Predicate<String> predicate = new Predicate<String>() {
    //   @Override
    //   public boolean test(String s) {
    //     return MethodReferenceApp.this.isLowerCase(s);
    //   }
    // };
    //
    // Predicate<String> predicate = value -> MethodReferenceApp.this.isLowerCase(value);

    // # Method Reference Non-Static
    // Predicate<String> predicate = MethodReferenceApp.this::isLowerCase;
    Predicate<String> predicate = this::isLowerCase;

    System.out.println(predicate.test("August"));
    System.out.println(predicate.test("august"));
  }

  public void run2() {
     MethodReferenceApp app = new MethodReferenceApp();
    // # Method Reference Object
    Predicate<String> predicate = app::isLowerCase;

    System.out.println(predicate.test("August"));
    System.out.println(predicate.test("august"));
  }

  public boolean isLowerCase(String value) {
    for (var c: value.toCharArray()) {
      if(!Character.isLowerCase(c)) return false;
    }
    return  true;
  }
}
