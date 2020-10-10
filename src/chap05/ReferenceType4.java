package chap05;

public class ReferenceType4 {

	public static void main(String[] args) {
		String str1 ="java";
		String str2 ="java";
		String str3 = new String("java");
		
		
		System.out.println(str1==str2);
		System.out.println(str2==str3); //인스턴스끼리 비교 
		
		System.out.println(str1.equals(str3));// 안의 문자열 비교
				
	}

}
