package abs_interface;

public class Suleman_House extends TownHouse implements House, Housing_Society{

	@Override
	public void bedroom() {
		// TODO Auto-generated method stub
		System.out.println("it has 5 bedrooms");
		
	}

	@Override
	public void bathroom() {
		// TODO Auto-generated method stub
		System.out.println("it has 3 bathroom");
		
	}


	public void garage() {
		// TODO Auto-generated method stub
		System.out.println("must have garage in it");
		
	}

	@Override
	public void basement() {
		// TODO Auto-generated method stub
		System.out.println("Basement is mendatory in townhouse");
		
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("can't be bigger than 240sq/yds");
		
	}

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("Can't be more than $300,000");
		
	}
}
