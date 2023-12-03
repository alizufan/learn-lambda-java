package JavaUtilFunc;

import java.util.function.Predicate;

public class PredicateApp {
  public static void main(String[] args) {

    // # Anonymous class
    Predicate<String> predicateCheckBlank = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.isBlank();
      }
    };
    System.out.println(predicateCheckBlank.test(""));

    // # Lambda version
    Predicate<String> predicateCheckBlank2 = value -> value.isBlank();
    System.out.println(predicateCheckBlank.test("August"));
  }
}
