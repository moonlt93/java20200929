package chap06.textbook.s060704;

public class Car {
	 //필드 
		String company="현대 자동차 ";
		String model;
		String color;
		int maxspeed;
	//생성자 오버로딩 : 매개변수를 달리하는 생성자 여러개 생성. 
	//생성자: 클래스(타입 변수,타입 변수 )
	Car(){
		
	}
		
		
	Car(String model){
		this.model =model;
		
		}

	Car(String model,String color){
		this.model =model;
		this.color =color;
		
	}
	Car(String model, String color,int maxSpeed){
		this.model =model;
		this.color =color;
		this.maxspeed =maxSpeed;
		}
}