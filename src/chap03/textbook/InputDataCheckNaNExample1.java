package chap03.textbook;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		
		String input = "3.14"; // ���ڿ� 3.14 input
		double v =Double.valueOf(input); //valueOf�� input���� v�� double ���ڿ��� ��ȯ
		System.out.println(v); //v ���
		
		String userInput="NaN"; //NaN �Է� 
		double val =Double.valueOf(userInput); //input ���� double�� ����
		
		double currentBalance =10000.0; //10000.0���� currentBalance �� 
		
		
		if(Double.isNaN(val)) // true ���  val =0.0
		
		{
			val =0.0;
			
		}
		
		
		currentBalance+=val;
		
		System.out.println(currentBalance);

	}

}
