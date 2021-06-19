package creational.abstract_factory;

public class EducationLoan extends Loan {

  @Override
  void getRateOfInterest(double rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }
}
