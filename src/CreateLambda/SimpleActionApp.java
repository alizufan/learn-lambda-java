package CreateLambda;

public class SimpleActionApp {
  public static void main(String[] args) {
    // # Anonymous class version
    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action(String name) {
        return name;
      }
    };
    System.out.println(simpleAction1.action("August"));

    // # Lambda version With Block
    SimpleAction simpleAction2 = (String name) -> {
      return name;
    };
    System.out.println(simpleAction2.action("De Caprio"));

    // # Lambda version With Block, No Type Data
    SimpleAction simpleAction3 = (name) -> {
      return name;
    };
    System.out.println(simpleAction3.action("Antonio De Caprio"));

    // # Lambda version Without Block, No Type Data
    SimpleAction simpleAction4 = (name) -> "Hi " + name;
    System.out.println(simpleAction4.action("August De Caprio"));

    SimpleAction simpleAction5 = name -> "Hi " + name;
    System.out.println(simpleAction5.action("Maria De Lugas"));
  }
}
