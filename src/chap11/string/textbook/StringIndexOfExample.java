package chap11.string.textbook;

public class StringIndexOfExample {

	public static void main(String[] args) {
			String subject ="�ڹ� ���α׷���";
				
			int location =subject.indexOf("���α׷���");//3
			System.out.println(location);
			
			
			if(subject.indexOf("�ڹ�") != -1) //true
			{
			System.out.println("�ڹٿ� ���õ� å�̱���");
			
			}else{
				System.out.println("�ڹٿ� ���þ��� å�̱���");
			}
	}

}
