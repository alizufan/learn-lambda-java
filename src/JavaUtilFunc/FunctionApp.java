package JavaUtilFunc;

import java.util.function.Function;

public class FunctionApp {
  public static void main(String[] args) {
    // # Anonymous class
    Function<String, Integer> functionLength = new Function<String, Integer>() {
      @Override
      public Integer apply(String value) {
        return value.length();
      }
    };

    System.out.println(functionLength.apply("Antonio"));

    // # Lambda version
    Function<String, Integer> functionLength2 = value -> value.length();
    System.out.println(functionLength.apply("August"));
  }
}
