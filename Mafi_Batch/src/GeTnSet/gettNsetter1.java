package GeTnSet;

public class gettNsetter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getterNsetter it = new getterNsetter();
		it.setITfield("Development Environment");
		getterNsetter it2 = new getterNsetter();
		it2.setITfield("QA Enironment");
		System.out.println(it.getITfield());
		System.out.println(it2.getITfield());
		
		getterNsetter fin= new getterNsetter();
		fin.setFinance(45);
		System.out.println(fin.getFinance());
		getterNsetter fin2= new getterNsetter();
		fin2.setFinance(34);
		System.out.println(fin2.getFinance());
		System.out.println(fin.getFinance());
		
		getterNsetter ps= new getterNsetter();
		ps.setPSL("Kings","Zalmi");
		System.out.println(ps.getPSL());
		
		getterNsetter sp= new getterNsetter();
		sp.setPSL("United","Gladiators");
		System.out.println(sp.getPSL());
		
		System.out.println(ps.getPSL());
		System.out.println(fin2.getFinance());
		System.out.println(fin.getFinance());

	}

}
