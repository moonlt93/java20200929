package chap03.binary;

public class LogicalOperator {

	public static void main(String[] args) {
		//�� ������
		//&& & and �纯�� true �϶���, true
		//|| | or �纯�� false �϶���, false
		// ^ xor (exclusive or ��Ÿ������) :�ٸ� ���� true
		
		
		System.out.println("======and========");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println("======or========");
		System.out.println(true||true); 
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("======xor========");
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println("=========& | ============"); // & | ���� �Ѵ���.
		int a =3;
		System.out.println(false &false);
		System.out.println(false &true);
		System.out.println((a<0) & (a++ < 0));
		System.out.println(a);
		
		System.out.println("=========&& || ============"); //&& || �� ���� �Ǵ�x short circuit
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0)&&(a++ < 0));
		System.out.println(a);
	}

}
