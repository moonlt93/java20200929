package chap07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver =new Driver();
		
		Bus bus =new Bus(); // 버스 개체 생성
		Taxi taxi =new Taxi(); //택시 객체 생성
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
