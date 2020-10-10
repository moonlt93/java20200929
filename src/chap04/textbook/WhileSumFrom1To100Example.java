package chap04.textbook;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
	int sum =0;
	
	int i=1;
	
	while(i<=100) {
		sum+=i;
		i++;
	}
	System.out.println("1~"+(i-1)+"합:"+sum); //마지막 출력이 101로 나와서 1 빼준다.

	}

}
