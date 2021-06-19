package creational.abstract_factory;

public class LoanFactory implements AbstractFactory {

  @Override
  public Bank getBank(String bankName) {
    return null;
  }

  @Override
  public Loan getLoan(String loanType) {
    if (null == loanType) {
      return null;
    }
    Loan loan = null;
    if (loanType.equalsIgnoreCase("Home")) {
      loan = new HomeLoan();
    }
    if (loanType.equalsIgnoreCase("Business")) {
      loan = new BusinessLoan();
    }
    if (loanType.equalsIgnoreCase("Education")) {
      loan = new EducationLoan();
    }
    return loan;
  }
}
