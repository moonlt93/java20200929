package chap04.textbook;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		/*
		System.out.println("�Է�>");
	int i =	System.in.read();
	int j =	System.in.read();
	int k =	System.in.read();
		
		System.out.println("���");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	*/
	
	boolean run = true;
	int speed =0;
	int keyCode =0;
	
	while(run) {
		if(keyCode!=13 && keyCode!=10) {
			System.out.println("------------");
			System.out.println("1.���� | 2.���� | 3.����");
			System.out.println("-------------");
			System.out.println("����: ");
					
		}
	keyCode =System.in.read();
	if(keyCode == 49) {
		speed++;
		System.out.println(" ���� �ӵ�= "+ speed);
	}else if (keyCode==50) {
		speed--;
		System.out.println("���� �ӵ� ="+ speed);
	}else if(keyCode ==51)
		{
			run=false;
		}
	
		
System.out.println("���α׷� ����");	
	}
}	
	
	
	
	

}
