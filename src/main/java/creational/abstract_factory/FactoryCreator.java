package creational.abstract_factory;

public class FactoryCreator {

  private FactoryCreator() {
  }

  public static AbstractFactory getFactory(String choice) {
    AbstractFactory abstractFactory = null;
    if (choice.equalsIgnoreCase("Bank")) {
      abstractFactory = new BankFactory();
    } else if (choice.equalsIgnoreCase("Loan")) {
      abstractFactory = new LoanFactory();
    }
    return abstractFactory;
  }

}
