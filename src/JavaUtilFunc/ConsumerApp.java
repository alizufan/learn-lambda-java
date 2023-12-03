package JavaUtilFunc;

import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {
    // # Anonymous class
    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    consumer.accept("August");

    // # Lambda
    Consumer<String> consumer2 = value -> System.out.println(value);
    consumer2.accept("Antonio");
  }
}
