package creational.abstract_factory;

public class BankFactory implements AbstractFactory {

  @Override
  public Bank getBank(String bankName) {
    Bank bank = null;
    if (null == bankName) {
      return null;
    }
    if (bankName.equalsIgnoreCase("HDFC")) {
      bank = new HDFC();
    } else if (bankName.equalsIgnoreCase("ICICI")) {
      bank = new ICICI();
    } else if (bankName.equalsIgnoreCase("SBI")) {
      bank = new SBI();
    }
    return bank;
  }

  @Override
  public Loan getLoan(String loanType) {
   return null;
  }
}
