package chap11.string.textbook;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 ="신민철";
		String strVar3 ="신민철";
	
		if(strVar2==strVar3)//   같은 번짓수를 비교해서 true로 나옴. 이거 물어보기
		{
			System.out.println("같은 String 객체를 참조");
		}else {
			
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1==strVar2)// 얘는 다른 객체를 참조중 
		{
			System.out.println("같은 String 객체를 참조");
		}else {
			
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.contentEquals(strVar2)) //얘는 같은 객체를 참조.
		{
			System.out.println("같은 문자열을 가짐");
			
		}else {
			System.out.println("다른 문자열을 가짐.");
		}
	}
	

}
