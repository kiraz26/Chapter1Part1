package warmup;

import java.util.Scanner;

public class Road {

	public static void main(String[] args) {
		// 1)Step. get all values from console 
		Scanner input=new Scanner(System.in);
		System.out.println("Putting new Car to the road....");
		
		System.out.println("Choose your car model:");
		String carModel=input.next();
		
		System.out.println("Choose your car color:");
		String carColor=input.next();
		
		System.out.println("Choose your car current speed:");
		int carSpeed=input.nextInt();
		// 2) Step. Create car object using the values entered
		Car yourCar=new Car();
		yourCar.model=carModel;
		yourCar.color=carColor;
		yourCar.currentSpeed=carSpeed;
		
		yourCar.printCarInformation();
		
		yourCar.accelerate(30);
		yourCar.printCarInformation();

		int lastSpeed=yourCar.getCurrentSpeed();
		System.out.println(yourCar.color+" "+yourCar.model+ " last speed is " +lastSpeed);
		System.out.println(yourCar.color+" "+yourCar.model+ " last speed is " +yourCar.getCurrentSpeed());

		
		System.out.println("Yeni merkebiniz hayirli olsun!!!!");
		
		
	}

}
