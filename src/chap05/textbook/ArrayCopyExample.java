package chap05.textbook;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray =new String[5];
		
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length); // 복사할것의 길이
		
		oldStrArray[0]="data";
		
		for(int i=0; i<newStrArray.length; i++) {
			
			System.out.print(newStrArray[i]+",");
		}

	}

}
