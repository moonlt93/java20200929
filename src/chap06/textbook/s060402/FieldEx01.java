package chap06.textbook.s060402;

public class FieldEx01 {

	public static void main(String[] args) {
		int i;
		i=3;
		
		Car c1 =new Car(); //  c1이라는 이름의 car 클래스 sout(변수.필드이름) 
		c1.name ="mercedes";
		c1.model="bentz";
		c1.price=1000;
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();
		System.out.println(c2.name);
		System.out.println(c2.price);
		c2.name= "banpo-zye";
		c2.price= 35;
		
		System.out.println(c2.name);
		System.out.println(c2.price);
	
	}
}
