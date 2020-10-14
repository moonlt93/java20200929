package chap06.textbook.s061004;

public class Car {
	int speed;

	void run() 
		{
		System.out.println(speed + " 으로 달립니다.");

	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run(); //인스턴스 멤버라 인스턴스 만들어진 후 사용.
		
		Math.random();
		Math.abs(-3);//절댓값
	}
}
