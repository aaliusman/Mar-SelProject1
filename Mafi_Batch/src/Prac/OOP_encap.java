package Prac;

public class OOP_encap {
	int studentID;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public static String getStudentDOB() {
		return studentDOB;
	}
	public static void setStudentDOB(String studentDOB) {
		OOP_encap.studentDOB = studentDOB;
	}
	public static String getStudentName() {
		return studentName;
	}
	public static void setStudentName(String studentName) {
		OOP_encap.studentName = studentName;
	}
	static String studentDOB;
	static String studentName;

}
