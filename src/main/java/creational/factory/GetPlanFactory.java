package creational.factory;

public class GetPlanFactory {

  public Plan getPlan(String planType) {
    if (planType == null) {
      return null;
    }
    Plan plan = null;
    if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
      plan = new DomesticPlan();
    } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
      plan = new CommercialPlan();
    } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
      plan = new InstitutionalPlan();
    }
    return plan;
  }

}
