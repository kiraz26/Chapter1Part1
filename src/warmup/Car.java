package warmup;

public class Car {
	//Data
	String model;
	int currentSpeed;
	String color;
	
	//Method.1 does not accept any arguments and does not return anything - void
	public void printCarInformation() {
		System.out.println(color+" "+model+" is driving "+currentSpeed+" mph");
	}
	
	//Method.2 accepts argument but void
	public void accelerate(int moreSpeed) {
		currentSpeed= currentSpeed +moreSpeed;
		System.out.println("Accelerating.......");
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
	
	
}
