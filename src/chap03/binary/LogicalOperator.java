package chap03.binary;

public class LogicalOperator {

	public static void main(String[] args) {
		//논리 연산자
		//&& & and 양변이 true 일때만, true
		//|| | or 양변이 false 일때만, false
		// ^ xor (exclusive or 배타적논리합) :다를 때만 true
		
		
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
		
		System.out.println("=========& | ============"); // & | 연산 둘다함.
		int a =3;
		System.out.println(false &false);
		System.out.println(false &true);
		System.out.println((a<0) & (a++ < 0));
		System.out.println(a);
		
		System.out.println("=========&& || ============"); //&& || 뒷 연산 판단x short circuit
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0)&&(a++ < 0));
		System.out.println(a);
	}

}
