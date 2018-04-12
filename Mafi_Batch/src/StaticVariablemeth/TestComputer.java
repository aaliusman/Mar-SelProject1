package StaticVariablemeth;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Computer.setCom1("MacBook Air");
		System.out.println(Computer.getCom1());
//		System.out.println();
		Computer.setCom1("MacBook Air2");
		Computer cm= new Computer();
		cm.setCom2("MacBook Pro");
		System.out.println(cm.getCom2());
		cm.setCom2("MacBook Pro2");
		System.out.println(cm.getCom2());
		
		Computer com=new Computer();
		com.setCom3("HP Notebook");
		System.out.println(com.getCom3());
		cm.setCom1("MacBook Air2");
		System.out.println(cm.getCom1());

	}

}
