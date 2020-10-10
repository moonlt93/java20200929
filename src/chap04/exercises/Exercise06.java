package chap04.exercises;
 

public class Exercise06 {

	public static void main(String[] args) {
	
		for(int i=1; i <=5; i++)  
		{
			String str ="";
			for(int j=1; j <=i; j++) 
			{
				str += "*";
			}
			System.out.println(str);
		}
		
		System.out.println("---------------------");

		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++) {
				System.out.print("*"); //이줄에 뿌린다.
				}	
			System.out.println(); //다음줄에 뿌린다.
		}
	}
}