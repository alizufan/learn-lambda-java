package JavaUtilFunc;

import java.util.function.Supplier;

public class SupplierApp {
  public static void main(String[] args) {
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "August De Caprio";
      }
    };
    System.out.println(supplier.get());

    Supplier<String> supplier2 = () -> "Antonio De Caprio";
    System.out.println(supplier2.get());

  }
}
