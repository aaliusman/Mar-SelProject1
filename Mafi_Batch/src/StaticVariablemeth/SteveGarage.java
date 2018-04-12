package StaticVariablemeth;

public class SteveGarage {
	
	public int driveStatic;
	public int driveWaySize;
	public static String city;
	public String housename;
	
	public void SetGarageSize(int size1) {
		driveWaySize = size1;
		driveStatic = size1;
	}
	public int GetGarageSize() {
		return driveWaySize;
		
	}
	
	public void setCityname(String name) {
		city= name;
	}
	public static String getCityname() {
		return city;
		
	}
	
	public void setHouseName(String name) {
		housename=name;
	}
	public String getHouseName() {
		return housename;
	}
}
