package Java_Practice;

public class Interview_Qeustions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		for (int b=1; b<101;b++) {
			a = a+b;
			
		}
		System.out.println("Total="+a);
		
		
		String [] c= {"ali", "usman", "ali", "zayan", "burhan", "ali", "sidra", "ali"};
		int d= 0;
		String ab[] = new String[8];
		System.out.println(c[4]);
		for(int i=0;i<c.length;i++) {
		if( c[i] != "ali") {
			ab[d]=c[i];
			d++;
		}}
		
		for(int x=4;x<8;x++) {
			ab[x]="ali";
		}
		
		for(int z=0;z<c.length;z++) {
			System.out.print(ab[z]+"\t");
		}
		System.out.println("");
		System.out.println("****");
		
		int asd=1;
		for(int ac=1;ac<5;ac++) {
			for(int bc=1;bc<ac+1;bc++) {
				System.out.print(asd+"  ");
				asd++;
			}
			System.out.println(" ");
		}
		
		
		
		int asf=1;
		for(int acf=1;acf<10;acf++) {
			for(int bcf=1;bcf<acf+1;bcf++) {
				System.out.print("**");
				
			}
			System.out.println(" ");
		}
		
		int af=1;
		for(int sd=1;sd<5;sd++) {
			for(int ds=5;ds>sd;ds--) {
				System.out.print(af+"\t");
				af++;
			}
			System.out.println("");
		}
		
		String name= "namsU";
		for(int na=name.length()-1;na>-1;na--) {
			System.out.print(name.charAt(na));
			
		}
		System.out.println("");
		for(int pn=2;pn<50;pn++) {
			for(int pm=2; pm<=pn;pm++) {
				if(pn==pm) {
					System.out.print(pn+"\t");
				}
				if(pn%pm==0) {
					break;
				}
			}
		}
		System.out.println(" ");
		
		int k=0;
		int l=1;
		for(int fi=0;fi<10;fi++) {
			System.out.print(k+"\t");
			k=k+l;
			l=k-l;
					
		}
		int gh=0;
		int hg=1;
		for(int xy=0;xy<10;xy++) {
			System.out.print(gh+"\t");
			gh=gh+hg;
			hg=gh-hg;
		}
		System.out.println("");
		for(int xy=2;xy<=50;xy++) {
			for (int yx=2;yx<=xy;yx++) {
				if(xy==yx) {
					System.out.print(xy+"\t");
				}
				if(xy%yx==0) {
					break;
				}
			}
		}
		System.out.println("a"+"\t"+"b");
		int mn=1;
		for(int kl=1;kl<3;kl++) {
			for(int lk=1;lk<6;lk++) {
				System.out.print(mn+"\t");
				mn++;
			
		}
		System.out.println("");
		}
	}
	


}
