package chap06.lecture.constructor;

public class Car {
	String name;
	int price;
	
	
	//������
	//Ŭ������(�Ķ���� ���){
	//�����ڵ�;
	

	public Car() {
		System.out.println("������ �����");
		name="kia";
		price=600;
		
	}
	public Car(String carName) {
		System.out.println("String �޴� ������ �����.");
		System.out.println(carName);
		name=carName;
	
	
	}
	public Car(String carName, int carPrice) {
		name =carName;
		price =carPrice;
	}

}
