package chap07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver =new Driver();
		
		Bus bus =new Bus(); // ���� ��ü ����
		Taxi taxi =new Taxi(); //�ý� ��ü ����
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
