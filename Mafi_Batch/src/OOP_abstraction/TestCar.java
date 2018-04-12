package OOP_abstraction;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Toyota();
		
		car.start();
		car.stop();
		car.carShape();
		
		Toyota car2=new Toyota();
		car2.bodyColor();
		
		ModernCar modCar = new Toyota();
		modCar.hydrolicBreak();
		
		
		Car bmwCar = new BMW();
		bmwCar.start();
		
		

	}

}
