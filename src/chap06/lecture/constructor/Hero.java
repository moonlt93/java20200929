package chap06.lecture.constructor;
//this �ν��Ͻ��� ��ü 
public class Hero {
	
	String name;
	int power;

		public Hero(String name,int power) {
			this.name = name;
			this.power= power;
		}
		
		public Hero(String name)
		{
			this(name,100);
		
		}
	

}
