package creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Billing {

  public static void main(String[] args) {
    GetPlanFactory planFactory = new GetPlanFactory();
    System.out.printf("Enter the plan name for which the bill will be generated: ");
    String planType = null;

    System.out.println("Enter the number of units for bill will be calculated: ");
    int units = 0;
    try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      planType = bufferedReader.readLine();
      System.out.println("Enter the number of units for bill will be calculated: ");
      units = Integer.parseInt(bufferedReader.readLine());
      Plan plan = planFactory.getPlan(planType);

      System.out.println(String.format("Bill amount for %s of %d units is :", planType, units));
      plan.getRate();
      plan.calculateBill(units);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
