package IntroLambda;

public class SimpleActionApp {
  public static void main(String[] args) {
    // # Anonymous class version
    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action() {
        return "August";
      }
    };
    System.out.println(simpleAction1.action());

    // # Lambda version
    SimpleAction simpleAction2 = () -> {
      return "De Caprio";
    };
    System.out.println(simpleAction2.action());
  }
}
