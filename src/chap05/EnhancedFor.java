package chap05;

public class EnhancedFor {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8};
		for(int i=0; i<arr.length;i++)//0~i까지 쓰기 
			{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		for(int n: arr)  // 향상된 for문 이거 쓰면 위에꺼랑 똑같음.
			{
			System.out.println(n);
		}
		
	}

}
