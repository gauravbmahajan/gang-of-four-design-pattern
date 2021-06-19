package creational.abstract_factory;

public class ICICI implements Bank {

  private static final String bankName = "ICICI Bank";

  @Override
  public String getBankName() {
    return bankName;
  }
}
