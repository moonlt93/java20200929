package chap06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car();

		myCar.setGas(5);
		myCar2.setGas(9);
		System.out.println(myCar.gas);
		System.out.println(myCar2.gas);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
