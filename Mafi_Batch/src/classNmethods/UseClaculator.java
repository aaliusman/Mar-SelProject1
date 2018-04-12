package classNmethods;

public class UseClaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal = new calculator();
		int resultofAddition = cal.addition(10, 40);
		System.out.println(resultofAddition);

		int resultofSub = cal.subtraction(89, 34);
		System.out.println(resultofSub);

		int c1 = calculator.div(99, 9);
		int c2 = calculator.multiplication(20, 9);

		System.out.println("c1=" + c1 + "  c2=" + c2);

		int a = 0;
		int b = 1;
		for (int ab = 0; ab < 10; ab++) {
			System.out.print(a + "\t");
			a = a + b;
			b = a - b;

		}
		System.out.println(" ");

		for (int x = 2; x < 51; x++) {
			for (int y = 2; y <= x; y++) {
				if (x == y) {
					System.out.print(x + "\t");
				}
				if (x % y == 0) {
					break;
				}}}
		
				System.out.println(" ");
				
				int as[]= {1,0,2,0,3,0,4,0};
				int sa=0;
				int z[]= new int [8];
				
				for(int g=0;g<as.length;g++) {
					if(as[g]!=0) {
						z[sa] = as[g];
						sa++;}}
					
					for(int h=4;h<as.length;h++) {
						z[h]=0;
					}	
					
					
					for (int m=0;m<as.length;m++) {
						System.out.print(z[m]+"\t");
					}
					System.out.println(calculator.runs(45, 397));
				}
			
			}
		

	

