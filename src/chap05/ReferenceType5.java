package chap05;

public class ReferenceType5 {

	public static void main(String[] args) {
		String str1="java";
		String str2=new String("java");
		
		str2 =null;//참조하고 있는 인스턴스 없...
		
		//java virtual machine은 불필요하게 남은 인스턴스를 모아 제거함.
		//-->>garbage  collector(gc)
		
		
	}

}
