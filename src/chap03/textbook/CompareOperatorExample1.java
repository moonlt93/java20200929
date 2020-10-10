package chap03.textbook;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		int num1 =10;
		int num2 =10;
		
		boolean result1 =(num1==num2); //true
		boolean result2 = (num1 !=num2); //false
		boolean result3 =(num1 <=num2);// true
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 ='A'; //a
		char char2 ='B'; //b
		char char3 ='\u263a'; //이모티콘
		System.out.println(char3);
		boolean result4 =(char1 < char2); // true
			System.out.println("result4="+result4);
	}

}
