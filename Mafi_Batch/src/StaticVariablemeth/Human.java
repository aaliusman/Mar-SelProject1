package StaticVariablemeth;

public class Human {
	
	public static int height;
	public int width;
	public final int distance = 467;
	
	
	public static void smile() {
		height=21;
		//width=234;  not allowed
		System.out.println("People do smile");
	}
	public void speak() {
		width=34;
		height=23;
		//distance=75; not allowed
		System.out.println("People do speak");
	}

}
