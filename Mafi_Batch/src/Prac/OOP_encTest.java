package Prac;

public class OOP_encTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOP_encap st1= new OOP_encap();
		st1.setStudentID(4532);
		st1.setStudentName("M Ali Usman");
		st1.setStudentDOB("12-13-14");
		System.out.println(st1.getStudentID()+" "+st1.getStudentName()+" "+st1.getStudentDOB());
		
		OOP_encap st2 = new OOP_encap();
		st2.setStudentID(4535);
		st2.setStudentName("M Ali Zayan");
		st2.setStudentDOB("10-11-12");
		System.out.println(st2.getStudentID()+" "+st2.getStudentName()+" "+st2.getStudentDOB());

	}

}
