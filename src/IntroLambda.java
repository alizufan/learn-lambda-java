// # What is Lambda?
//   - Lambda comes from lambda calculus,
//     which refers to anonymous functions (functions without names).
//   - But, in Java, functions/methods cannot stand alone.
//   - So it is possible that in practice,
//     lambda in Java and in other programming languages will be different.
//
// # Anonymous Class
//   - In Java we only know Anonymous Class.
//   - Lambda in Java is actually a simplified version of creating an anonymous class.
//
// # Lambda requirements
//   - In the form of an interface.
//   - Has 1 abstract method.
//   - Added @FunctionalInterface annotation to the interface.
//   - Minimum use Java 8.
//
//
public class IntroLambda {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}