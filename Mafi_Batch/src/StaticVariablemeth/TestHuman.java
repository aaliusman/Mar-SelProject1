package StaticVariablemeth;

public class TestHuman {

	public static void main(String[] args) {
		
		
		Human.smile();
		
		Human human = new Human();
		human.speak();
		Human.height=45;
		System.out.println(Human.height);
		System.out.println(human.distance);
		System.out.println(Human.height);
	}

}
