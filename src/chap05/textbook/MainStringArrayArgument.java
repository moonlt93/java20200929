package chap05.textbook;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) //args :string ����true 
			{
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument Num1 Num2");
			System.exit(0);
		}

		
		
		String strNum1 =args[0];
		String strNum2 =args[1];
		
		int num1 =Integer.parseInt(strNum1); // valueOf�� ����� ����. 
		int num2 =Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		
		
		
	}

}
