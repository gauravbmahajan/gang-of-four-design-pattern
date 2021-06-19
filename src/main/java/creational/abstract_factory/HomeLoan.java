package creational.abstract_factory;

public class HomeLoan extends Loan {

  @Override
  void getRateOfInterest(double rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }
}
