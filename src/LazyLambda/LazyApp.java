package LazyLambda;

import java.util.function.Supplier;

// # Lazy Paramater
//   - Java does not have a lazy parameter feature like in programming languages like Scala.
//   - Lazy parameters mean, the parameters will only be executed when accessed.
//   - Fortunately, by using Lambda, we can create parameters like lazy parameters.
//
public class LazyApp {
    public static void main(String[] args) {
        // By default, the parameter in Java is Eager, so it is always called first.
        // testScore(60, getName());

        // # Test
        //  - Test with score 90, check console
        //  - Test with score 60, check console the func getName() not invoked
        //
        // # Lambda
        // testScore(60, () -> getName());

        // # Lambda Method Reference
        testScore(60, LazyApp::getName);
    }

    // # Lazy Paramater
    public static void testScore(int score, Supplier<String> name) {
        if(score > 80) {
            System.out.println("Congratulations " + name.get() + " , You Passed!");
            return;
        }

        System.out.println("Try Again Next Year!");
    }

    // # Not Lazy
    // public static void testScore(int score, String name) {
    //     if(score >= 80) {
    //         System.out.println("Congratulations " + name + " , You Passed!");
    //         return;
    //     }
    //     System.out.println("Try Again Next Year!");
    // }

    public static String getName() {
        System.out.println("invoke a func getName()");
        return "Antonio";
    }
}
