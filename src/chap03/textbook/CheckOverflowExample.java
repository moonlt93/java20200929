package chap03.textbook;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try //시도 void 리턴 안받겠다. STRING: RETURN시 받는 타입.
		{
			int result= safeAdd(2000000000,2000000000);
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}

	}


	public static int safeAdd(int left,int right) {
		
		if((right>0)) // 함수 = 메소드 
		{
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
				
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
				
			}
		}
	return left+right;
	
	}
		
}


