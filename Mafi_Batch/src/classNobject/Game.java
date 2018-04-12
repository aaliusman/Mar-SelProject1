package classNobject;

public class Game {

	public Game() {

	}

	public Game(String a) {
		
		System.out.println(a);
	}
	public Game(String b, int age) {
		System.out.println(b+" "+age);
	}
	public Game(String a, String b) {
		this.player= a;
		String bc="This is fun";
		System.out.println(a+" "+bc+" "+b);
	}

	String player;
	int teams;

	public void Sport() {
		System.out.println("I love sports");
	}

	public void spName() {
		System.out.println("Cricket, Football, baseball, basketball");
	}

}
