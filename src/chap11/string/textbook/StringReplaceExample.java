package chap11.string.textbook;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr ="�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� aPI�� ���� �մϴ�.";
		String newStr =oldStr.replace("�ڹ�","JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
