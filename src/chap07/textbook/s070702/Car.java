package chap07.textbook.s070702;

public class Car {
	
	Tire frontLeftTire =new Tire("�տ���",6);
	Tire frontRightTire =new Tire("�տ�����",6);
	Tire backLeftTire =new Tire("�ڿ���",6);
	Tire backRightTire =new Tire("�ڿ�����",6);
			

	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {stop();return 1 ;}
		if(frontRightTire.roll()==false){stop();return 2 ;}
		if(backLeftTire.roll()==false){stop();return 3 ;}
	   if(backRightTire.roll()==false){stop();return 4 ;}
	return 0;
	}

		void stop() {
			System.out.println("�ڵ����� ����ϴ�.");
		}

}
