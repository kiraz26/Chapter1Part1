package arrays;

public class MyArrays {

	public static void main(String[] args) {
		//array named number that can hold 3 ints
		int[] numbers=new int[4];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		numbers[3]=1;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);

		int sum=numbers[0]+numbers[1]+numbers[2];
		System.out.println(sum);
		
		//create a string array called CreditCards and store, Visa, Amex, MasterCard in 
		//one array variable
		String[] CreditCards=new String[3];
		CreditCards[0]="Visa";
		CreditCards[1]="Amex";
		CreditCards[2]="MasterCard";
		System.out.println(CreditCards[0]);
		System.out.println(CreditCards[1]);
		System.out.println(CreditCards[2]);

		String allCards=CreditCards[0]+" " +CreditCards[1]+" "+CreditCards[2];
		System.out.println(allCards);

		
		
	}

}
