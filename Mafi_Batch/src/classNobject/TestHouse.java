package classNobject;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		house Myhouse = new house();
		house.watchTV();
		Myhouse.party();
		System.out.println(Myhouse.address);
		
		house m1 = new house();
		m1.watchTV();
		m1.party();
		m1.address=154;
		System.out.println(m1.address);
		
		int num1=10;
		int num2=num1;
		System.out.println(num2);
		house.housename="Suleman House";
		System.out.println(house.housename);

	}

}
