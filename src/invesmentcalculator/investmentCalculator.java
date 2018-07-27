package invesmentcalculator;

public class investmentCalculator {
	int investmentAmount;
	double rateOfInterest;
	int numberOfYears;
	
	
	public double calculateInvestmentValue(int investmentAmount, double rateOfInterest, int numberOfYears) {
		//rateOfInterest=rateOfInterest/100;
		double interestAmount= (investmentAmount*rateOfInterest)*numberOfYears;
		double totalValue=(interestAmount+investmentAmount);
		return totalValue;
		
	}
}
