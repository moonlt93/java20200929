package chap11.string.textbook;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 ="�Ź�ö";
		String strVar3 ="�Ź�ö";
	
		if(strVar2==strVar3)//   ���� �������� ���ؼ� true�� ����. �̰� �����
		{
			System.out.println("���� String ��ü�� ����");
		}else {
			
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVar1==strVar2)// ��� �ٸ� ��ü�� ������ 
		{
			System.out.println("���� String ��ü�� ����");
		}else {
			
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVar1.contentEquals(strVar2)) //��� ���� ��ü�� ����.
		{
			System.out.println("���� ���ڿ��� ����");
			
		}else {
			System.out.println("�ٸ� ���ڿ��� ����.");
		}
	}
	

}
