package chap04.exercises;

//1. 숫자 두개 난수 설정 2. while문조건 만들기  break 걸기 3.출력 
public class Exercise04 {

	public static void main(String[] args) {
//		int i;
//		int num1=(int)(Math.random()*6)+1;
//		int num2=(int)(Math.random()*6)+1;
//		int sum= num1+num2;
//		
//		while(num1+num2==5)
//		{
//			break;
//		}
//		System.out.println(num1+","+num2);

		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + dice1 + ", " + dice2 + ")");

			if ((dice1 + dice2) == 5) {
				break;
			
			}
		}

	}
}
