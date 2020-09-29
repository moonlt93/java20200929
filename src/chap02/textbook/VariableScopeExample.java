package chap02.textbook;

public class VariableScopeExample {

	public static void main(String[] args) {

		
			int v1 =15; 
			//int v2 =;
			if(v1>10) {
				int v2=v1-10;
				
			}
			int v3=v1+5;  //v2가 변수를 사용x 컴파일에러 생김.
	}

}
