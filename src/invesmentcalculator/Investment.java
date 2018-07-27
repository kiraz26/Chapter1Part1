package invesmentcalculator;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Investment Amount:");
		int investmentAmount=input.nextInt();
		
		System.out.println("Enter Rate of Interest:");
		double rateOfInterest=input.nextDouble();
		
		System.out.println("Enter Number of Years:");
		int numberOfYears=input.nextInt();
		rateOfInterest=rateOfInterest/100;
		System.out.println("Interest rate: "+rateOfInterest);
		System.out.println("Calculating................");
		
	/* Code version: 1.0
	 * 	rateOfInterest=rateOfInterest/100;
		
		System.out.println("Interest rate: "+rateOfInterest);

		double interestAmount=(investmentAmount*rateOfInterest)*numberOfYears;
		double totalValue=interestAmount+investmentAmount;
		
		System.out.println("Investment value after "+numberOfYears+" years ;" +totalValue);  
	*/
		
	/*Code version: 1.2
	 * we are using object of investmentCalculator
	
	*/
		investmentCalculator investment=new investmentCalculator();
		double totalValue=investment.calculateInvestmentValue(investmentAmount, rateOfInterest, numberOfYears);
		
		System.out.println("Investment value after "+numberOfYears+" number of years "+ totalValue);
		
		
	}

}
