package chap03.unary;

public class lncDecOperator {

	public static void main(String[] args) {
		//���������� increment
		//++
		//������ ���� ������ 1�� ���� �� ������ �ٽ� ����
		
		
		//���� ������decrement
		//--
		//������ ���� ������ 1�� �� �� ������ �ٽô���
		
		int var1 =5;
		int var2 =5;
		
		var1++;
		var2--;
		
		System.out.println(var1);
		System.out.println(var2);
		
		//�������� ��ġ
		//�����ڰ� �ڿ� ���� ����� �� �Ҵ�
		//�����ڰ� �տ� ���� �Ҵ� �� ���
		
		int var3=5;
		int var4=5;
		
		int var5= 3 +(var3++);
		System.out.println(var5);
		System.out.println(var3);
		
		int var6 =3+(++var4);
		System.out.println(var6);
		System.out.println(var4);
		
		
		
		
	}

}
