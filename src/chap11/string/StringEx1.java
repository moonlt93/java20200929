package chap11.string;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 ="java";
		char c1 =str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		//System.out.println(str1.charAt(4));
		
		
		//equals
		String str2 ="python";
		String str3 ="python";
		String str4 ="py";
		String str5 ="thon";
		String str6 = str4+str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2==str6);
		System.out.println(str2.equals(str6));
		
		
		
		
		//indexOf
		String str7 ="�ڹ� ���α׷���";
		int a=str7.indexOf("�ڹٷ�");
		System.out.println(a);
		
		
		
		//length
		String str8 ="�̰��� �ڹٴ�.";
		int l = str8.length();		
		System.out.println(l);
		System.out.println(str8.charAt(l-1));
	
	
		//replace ���ڷ� ��ü�Ǿ���.
		String str9="abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
	
		//subString 
		String str11 ="0123456789";
		String sub = str11.substring(2,3);
		System.out.println(sub);
		sub=str11.substring(5,str11.length());
		System.out.println(sub);
		
		sub =str11.substring(6);
		System.out.println(sub);
		
		
		//trim 
		String str12 = " java ";
		String t =str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
	}

}
