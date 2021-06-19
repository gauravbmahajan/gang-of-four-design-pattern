package creational.abstract_factory;

public abstract interface AbstractFactory {
  public abstract Bank getBank(String bankName);
  public abstract Loan getLoan(String loan);
}
