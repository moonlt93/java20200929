package chap06.textbook.s060802;
//this 사용 물어보기 , 클래스 안의 인스턴스를 대체 
public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;//인스턴스 필드 지칭.
	}

	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
	
	System.out.println("gas가 있습니다.");
	return true;
	}
	void run() {
		while(true)
			if(gas>0) {
				System.out.println("달립니다. (gas잔량:"+gas+")");
				gas -=1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;//void가 있으므로 값 넣지마. 
			}
	
	}

}
