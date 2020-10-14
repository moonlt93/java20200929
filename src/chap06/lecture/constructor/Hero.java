package chap06.lecture.constructor;
//this 인스턴스를 대체 
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
