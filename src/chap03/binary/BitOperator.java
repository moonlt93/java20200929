package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ ����(����)
		int i = 10;
		int j = ~i;
		System.out.println(j);
	
		// ����
		// & and : ���� �ڸ��� bit�� 1�� ��츸 1, ������ 0
		// | or : ���� �ڸ��� bit�� 0�� ��츸 0, ������ 1
		// ^ xor : ���� �ڸ��� bit�� �ٸ� ��� 1, ������ 0
		// �ǿ����� : integer
		// ��� : integer
		int a = 45;
		int b = 25;
		int c = a & b;
		System.out.println(c);
		
		c = a | b;
		System.out.println(c);
		
		c = a ^ b;
		System.out.println(c);
		
		// bit shift ������
		// << : �� bit�� �������� �ű�, �������� 0���� ä��
		// >> : �� bit�� ���������� �ű�, ������ msb(Most Significant Bit) �ֻ��� ��Ʈ�� ä��
		// >>> : �� bit�� ���������� �ű�, ������ 0���� ä��
		
		int val = 3;// 
		int res = val << 3;
		System.out.println(res);
		
		val = 98;
		res = val >> 2;
		System.out.println(res);
		
		val = -17;
		res = val >> 1;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
	}
}








