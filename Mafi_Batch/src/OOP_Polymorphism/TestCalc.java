package OOP_Polymorphism;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MortgageCal mc= new MortgageCal();
		System.out.println(mc.house(3456, 12));
		System.out.println(mc.house(24, 4, 4));
		System.out.println(mc.house(56, "Langhorne"));
		
		AutoCal ac= new AutoCal();
		System.out.println(mc.house(2, 2, 2));
		System.out.println(ac.house(2, 2, 2));
		

	}

}
