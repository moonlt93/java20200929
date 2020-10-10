package chap02.type.casting;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		
				//privitive type 8개
				
				//  1  2     4    8byte
				//boolean
				//byte short int long
				//           float double
			
		byte byteValue=3;
		short shortValue=129;
		int intValue =1000000;
		long longValue =100000000L;
		
		//자동 형변환
		shortValue = byteValue;
		intValue=shortValue;
		longValue=intValue;
		
		//강제 형변환
		longValue=3333;
		intValue =(int)longValue;
		System.out.println(intValue);

		
		//자동형변환(정수->실수)
				float floatValue =0.0F;
				double doubleValue =0.0;
				
				doubleValue = intValue; //잃어버리는값 생길수도?
				floatValue = intValue;
				
				floatValue=longValue;
				
				longValue=9223372036854775807L;
				floatValue =longValue;
				System.out.println(floatValue);
				doubleValue = longValue;
	
				//강제 형변환(실수->정수) 소수점 버림
				intValue=(int)floatValue;
				System.out.println(intValue);
				
				
	
	}

}
