package creational.abstract_factory;

public class BusinessLoan extends Loan {

  @Override
  void getRateOfInterest(double rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }
}
