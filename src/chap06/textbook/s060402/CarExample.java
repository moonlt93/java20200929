package chap06.textbook.s060402;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar= new Car();//myCar Ŭ���� ���� .company �ʵ� myCar Ŭ���� ����. 
		System.out.println("����ȸ��:"+myCar.company);
		System.out.println("�𵨸�:"+myCar.model);
		System.out.println("����:"+myCar.color);
		System.out.println("�ְ�ӵ�:"+myCar.maxSpeed);
		System.out.println("����ӵ�:"+myCar.speed);
	//�� �ʵ� �ֱ�
	
	//���� ����. 
	myCar.speed=60; // 
	myCar.color ="������";
	System.out.println("������ �ӵ�: "+myCar.speed);
	}

}
