package StaticVariablemeth;

public class TestDriveWay {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		// SteveGarage steveGarage = new SteveGarage();
		// steveGarage.SetGarageSize(12);
		// System.out.println(steveGarage.GetGarageSize());
		//
		// SteveGarage neigbor=new SteveGarage();
		// neigbor.SetGarageSize(14);
		// System.out.println(neigbor.GetGarageSize());
		//
		// System.out.println(steveGarage.GetGarageSize());
		// System.out.println(neigbor.GetGarageSize());

		SteveGarage steveSize = new SteveGarage();
		steveSize.SetGarageSize(45);
		System.out.println(steveSize.GetGarageSize());

		SteveGarage SteveNeb = new SteveGarage();
		SteveNeb.SetGarageSize(55);
		System.out.println(SteveNeb.GetGarageSize());
		System.out.println(steveSize.GetGarageSize());

		SteveGarage HN = new SteveGarage();
		HN.setHouseName("Suleman House");
		SteveGarage HN2 = new SteveGarage();
		HN2.setHouseName("Akhtar House");

		SteveGarage ct2 = new SteveGarage();
		ct2.setCityname("Philadelphia");
		SteveGarage ct = new SteveGarage();
		ct.setCityname("Karachi");

		System.out.println(HN.getHouseName());
		// suleman house, Akh, suleman house, karachi, philly, philly
		System.out.println(HN2.getHouseName());
		System.out.println(HN.getHouseName());

		System.out.println(ct.getCityname());
		System.out.println(ct2.getCityname());
		

	}

}
