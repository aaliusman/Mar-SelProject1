package classNobject;

public class Gametype {
	
	public static void main(String[] args) {
		
		Game gm= new Game("Brian Lara");
		Game gm2=new Game("Usman", 34);
		Game gm3=new Game("Usman", "is Awesome");
		gm.spName();
		gm.Sport();
		gm.player="Lebron James";
		gm.teams= 45;
		
		System.out.println(gm.player+"="+gm.teams);
		gm.player="Javed Miandad";
		gm.teams= 34;
		System.out.println(gm.player+"="+gm.teams);
		
	}

}
