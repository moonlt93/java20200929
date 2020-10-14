package chap06.textbook.s060402;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar= new Car();//myCar 클래스 변수 .company 필드 myCar 클래스 생성. 
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
	//각 필드 넣기
	
	//변수 조정. 
	myCar.speed=60; // 
	myCar.color ="빨간색";
	System.out.println("수정된 속도: "+myCar.speed);
	}

}
