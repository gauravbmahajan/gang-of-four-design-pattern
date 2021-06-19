package creational.abstract_factory;

public abstract class Loan {

  protected double rateOfInterest;

  abstract void getRateOfInterest(double rateOfInterest);

  public void calculateLoanPayment(double loanAmount, int years) {
    double emi;
    int n = years * 12;
    rateOfInterest = rateOfInterest / 1200;
    emi =
        ((rateOfInterest * Math.pow((1 + rateOfInterest), n)) / ((Math.pow((1 + rateOfInterest), n))
            - 1)) * loanAmount;
    System.out.println(String
        .format("Your monthly EMI is %f for the amount %f you have borrowed", emi, loanAmount));
  }

}
