package creational.abstract_factory;

public class SBI implements Bank {

  private static final String bankName = "SBI Bank";

  @Override
  public String getBankName() {
    return bankName;
  }
}
