package OOP_abstraction;

public class Toyota extends ModernCar implements Car, Motor{

	
	//Car interface
	public void start() {
		System.out.println("Lets driver the car");
	}
	public void stop() {
		System.out.println("Have a break system to stop the car");
	}
	public void carShape() {
		System.out.println("Shape shouldn't be ore the 6 feet and 4 feet wide");

	}
	public void bodyColor() {
		System.out.println("white");
	}
	
	//Motor interface
	public void engine() {
		System.out.println("3.5l engine");
		
	}
	
	public void fueltype() {
		System.out.println("Gasoline");
		
	}
	
	public void hydrolicBreak() {
		System.out.println("this car has hydrolic break system");
		
	}

}
