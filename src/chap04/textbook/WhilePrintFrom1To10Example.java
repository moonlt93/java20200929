package chap04.textbook;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//11~20
		//1~9È¦¼ö
		//10~1
		//10~2Â¦¼ö
		
		int k=11;
		while(k<=20) {
			System.out.println(k);
			k++;
		}
		System.out.println("---------------------");
		int j=1;
		
		while(j<6) {
			int l =(2*j)-1;
			System.out.println(l);
			j++;
		}
		
		System.out.println("---------------------");
		int o =10;
		while(o>=1) {
			System.out.println(o);
			o--;
		}
		System.out.println("---------------------");
		int t =5;
		while(t>=1) {
			
			int b =2*t;
			System.out.println(b);
			t--;
		}
		
	}

}
