package OOP_ecapsulation;

public class TestStudent extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stName = "usman";
		Student st1= new Student();
		st1.setStID(4532);
		st1.setStName("Usman");
		st1.setStDOB("12-16-1983");
		
		System.out.println(st1.getStID()+" "+ st1.getStName()+" "+ st1.getStDOB());
		
		Student st2= new Student();
		st2.setStID(4534);
		st2.setStName("Zayan");
		st2.setStDOB("11-09-1991");
		System.out.println(st2.getStID()+" "+ st2.getStName()+" "+ st2.getStDOB());
		
		
		
	}
	
	
}
