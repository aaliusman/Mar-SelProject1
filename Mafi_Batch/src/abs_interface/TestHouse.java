package abs_interface;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	House house = new Suleman_House();
	house.bathroom();
	house.bedroom();
	house.garage();
	
	TownHouse th = new Suleman_House();
	th.basement();
	th.floors();
	
	Housing_Society hs= new Suleman_House();
	hs.Area();
	hs.Price();

	}

}
