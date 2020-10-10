package chap05;

public class ReferenceType2 {

	public static void main(String[] args) {
		int i =30;
		int j =i;
		
		
		String str1 = " java ";
		String str2 = str1; // str2는 str1이 참조하는 주소를 복사.
		
		
		System.out.println(i == j); //값이 같다.
		System.out.println(str1 == str2);
	
	
	
	
	}

}
