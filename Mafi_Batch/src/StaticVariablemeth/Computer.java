package StaticVariablemeth;

public class Computer {
	
	static String comp1;
	static String comp2;
	String comp3;
	String comp4;
	
	public static void setCom1(String a) {
		comp1=a;
		//comp3="asdf" can't use non static variable in static method
	}
	public static String getCom1() {
		return comp1;
	}
	
	public void setCom2(String b) {
		comp2=b;
		comp3="ab";
	}
	
	public String getCom2() {
		return comp2;
	}
	
	public void setCom3(String c) {
		comp3="HP notebook";
	}
	public String getCom3() {
		return comp3;
	}
}
