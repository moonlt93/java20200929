package chap06.textbook.s060801;

public class Calculator 
//calculator Ŭ���� ����

	{
	
	void powerOn() //����Ÿ��, �޼ҵ�
	{
		System.out.println("������ �մϴ�.");
	}
	int plus(int x,int y)
	{
		int result = x+y;
		return result;
	}
	
	
	double divide(int x , int y) {
		double result = (double)x/(double)y;
		return result;
		
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
