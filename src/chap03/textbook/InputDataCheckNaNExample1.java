package chap03.textbook;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		
		String input = "3.14"; // 문자열 3.14 input
		double v =Double.valueOf(input); //valueOf로 input값인 v를 double 문자열로 변환
		System.out.println(v); //v 출력
		
		String userInput="NaN"; //NaN 입력 
		double val =Double.valueOf(userInput); //input 값을 double로 변경
		
		double currentBalance =10000.0; //10000.0설정 currentBalance 값 
		
		
		if(Double.isNaN(val)) // true 출력  val =0.0
		
		{
			val =0.0;
			
		}
		
		
		currentBalance+=val;
		
		System.out.println(currentBalance);

	}

}
