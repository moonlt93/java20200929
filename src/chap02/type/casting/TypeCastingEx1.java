package chap02.type.casting;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		
				//privitive type 8��
				
				//  1  2     4    8byte
				//boolean
				//byte short int long
				//           float double
			
		byte byteValue=3;
		short shortValue=129;
		int intValue =1000000;
		long longValue =100000000L;
		
		//�ڵ� ����ȯ
		shortValue = byteValue;
		intValue=shortValue;
		longValue=intValue;
		
		//���� ����ȯ
		longValue=3333;
		intValue =(int)longValue;
		System.out.println(intValue);

		
		//�ڵ�����ȯ(����->�Ǽ�)
				float floatValue =0.0F;
				double doubleValue =0.0;
				
				doubleValue = intValue; //�Ҿ�����°� �������?
				floatValue = intValue;
				
				floatValue=longValue;
				
				longValue=9223372036854775807L;
				floatValue =longValue;
				System.out.println(floatValue);
				doubleValue = longValue;
	
				//���� ����ȯ(�Ǽ�->����) �Ҽ��� ����
				intValue=(int)floatValue;
				System.out.println(intValue);
				
				
	
	}

}
