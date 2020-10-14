package CodingBat;
public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}
	public int sumDouble(int a, int b) {
		int sum = a + b;
		sum = (a == b) ? sum * 2 : sum;
		return sum;
		
	}
	
	public int diff21(int n) {
		int diff = 21 - n; //diff ���� n�� 21������ �� 
		diff = (n > 21) ? diff * 2 : diff;//n���� 21�� ���� �� diff���� �ι谡 �ȴ�.
		diff = (diff < 0) ? -diff : diff;// -���� ����� ǥ���ϱ� ����
		return diff;
	}
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
		// || �̰Ŵ� or �������� �Ѵ� false�� �ƴϸ� true ���� ����.
		//�ٵ� false ���� �̾ƾ� �ǹǷ� and ������ ������.
		// �׷��� false+true ���� false�� ����.
	}
	public boolean makes10(int a, int b) {
		int sum = a + b;
		return (sum == 10) || (a == 10) || (b == 10);
	}
	//10 ����� a,b�� 10�̰ų� sum=10�� �̾Ƶ�  true���� ���;���.
	
	

	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);
		boolean d200 = (n >= 190) && (n <= 210);

		return d100 || d200;
		
	}
	//���� 2�� 90~110 ,190~210 �������ֱ� 
	//�Ѵ� ������ AND������ �� �̾��ֱ� 
	//d100, d200�� �ϳ��� �¾Ƶ� �������ֱ����� or�� ���.

	public boolean posNeg(int a, int b, boolean negative) {

		  
		  if (negative) {
		      return (a < 0 && b < 0);
		    }
		    else {
		      return ((a < 0 && b > 0) || (a > 0 && b < 0));
		    }
		}
	
//negative �϶�, �Ѵ� �������϶� true ��ȯ.
//������ ���ؼ� �����϶���, true;

	public String notString(String str) {
		  
		 if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
	//0~3���ڱ��̸� ������, not�̶� ���ؼ� true �� �״�� ��ȯ./
	//�ƴϸ� "not "+str �� ��ȯ.
	
public String missingChar(String str, int n) {
		
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
	}


	
	

//�׳� n�� ������ �����ִ� �Լ��� ����� �ſ���.
//substring���� ���۰� ���ܾ �������ְ� �������͵� �̱�����
//n+1�� ���� ������ ���� �̾���.



public String front3(String str) {
	int len = str.length(); //len���� ���� ã��

	String front = str; //front ���ڼ���

	if (len >= 3) //���ڱ��̰� 3�̻��϶�,
	{
		front = str.substring(0, 3); //ù���ں��� 3��° ���ڱ��� �̴´�.
	}

	String res = "";
	int i = 0;
	while (i < 3) {
		res += front;
		i++;
	}
	//while �� 0,1,2 �� ���� ���ư� ���� front+front+front�� �̾Ƴ�.

	return res;
	}


//public String backAround(String str) {
//	char c = str.charAt(str.length() - 1);
//
//	return c + str + c;
//}
//
//public String backAround(String str) {
//	char c = str.charAt(str.length() - 1);
//
//	return c + str + c;
//}

public boolean or35(int n) {
	boolean div3 = (n % 3) == 0;
	boolean div5 = (n % 5) == 0;

	return div3 || div5;
}

public String front22(String str) {
	String front = str;

	if (str.length() >= 2) {
		front = str.substring(0, 2);
	}

	return front + str + front;
}

public boolean startHi(String str) {
	return str.startsWith("hi");

	// if (str.length() >= 2) {
	// String front = str.substring(0, 2);
	// return front.equals("hi");
	// } else {
	// return false;
	// }

}

public boolean icyHot(int temp1, int temp2) {
	boolean t1 = temp1 < 0 && temp2 > 100;
	boolean t2 = temp1 > 100 && temp2 < 0;

	return t1 || t2;
}
}











