package creational.abstract_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryExample {

  public static void main(String[] args) {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Enter the name of bank where you want to take loan :");
      String bankName = bufferedReader.readLine();
      System.out
          .println("Enter the type of loan e.g. home loan or business loan or education loan : ");
      String loanType = bufferedReader.readLine();

      AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
      Bank bank = bankFactory.getBank(bankName);

      System.out.println(String.format("Enter the rate of interest for %s", bank.getBankName()));
      double rateOfInterest = Double.parseDouble(bufferedReader.readLine());

      System.out.println("Enter the loan amount you want to take: ");
      double loanAmount=Double.parseDouble(bufferedReader.readLine());

      System.out.println("Enter the number of years to pay your entire loan amount: ");
      int years=Integer.parseInt(bufferedReader.readLine());

      System.out.println("you are taking the loan from "+ bank.getBankName());

      AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
      Loan loan = loanFactory.getLoan(loanType);
      loan.getRateOfInterest(rateOfInterest);
      loan.calculateLoanPayment(loanAmount,years);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
