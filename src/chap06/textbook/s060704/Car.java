package chap06.textbook.s060704;

public class Car {
	 //�ʵ� 
		String company="���� �ڵ��� ";
		String model;
		String color;
		int maxspeed;
	//������ �����ε� : �Ű������� �޸��ϴ� ������ ������ ����. 
	//������: Ŭ����(Ÿ�� ����,Ÿ�� ���� )
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