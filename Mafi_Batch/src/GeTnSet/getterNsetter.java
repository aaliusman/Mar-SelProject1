package GeTnSet;

public class getterNsetter {
	String IT;
	static int Finance;
	static String PSL;
	
	public void setITfield(String field) {
		IT=field;
	}
	public String getITfield() {
		return IT;
		
	}
	
	public void setFinance(int interest) {
		Finance  = interest;
	}
	public int getFinance() {
		return Finance;
	}
	
	public void setPSL(String a, String b) {
		PSL  = a+b;
	}
	public String getPSL() {
		return PSL;
	}
}
