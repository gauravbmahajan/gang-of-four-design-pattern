package creational.abstract_factory;

public class HDFC implements Bank{
  private static final String bankName = "HDFC Bank";

  @Override
  public String getBankName() {
    return bankName;
  }
}
