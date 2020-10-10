package chap03.CodingBat;
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
		int diff = 21 - n; //diff 값은 n과 21사이의 수 
		diff = (n > 21) ? diff * 2 : diff;//n값이 21을 넘을 때 diff값은 두배가 된다.
		diff = (diff < 0) ? -diff : diff;// -값을 양수로 표현하기 위해
		return diff;
	}
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
		// || 이거는 or 연산으로 둘다 false가 아니면 true 값을 가짐.
		//근데 false 값도 뽑아야 되므로 and 연산을 더해줌.
		// 그래서 false+true 여도 false가 뽑힘.
	}
	public boolean makes10(int a, int b) {
		int sum = a + b;
		return (sum == 10) || (a == 10) || (b == 10);
	}
	//10 만들기 a,b가 10이거나 sum=10만 뽑아도  true값이 나와야함.
	
	

	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);
		boolean d200 = (n >= 190) && (n <= 210);

		return d100 || d200;
		
	}
	//범위 2개 90~110 ,190~210 지정해주기 
	//둘다 맞을때 AND문으로 참 뽑아주기 
	//d100, d200중 하나만 맞아도 인정해주기위해 or문 사용.

	public boolean posNeg(int a, int b, boolean negative) {

		  
		  if (negative) {
		      return (a < 0 && b < 0);
		    }
		    else {
		      return ((a < 0 && b > 0) || (a > 0 && b < 0));
		    }
		}
	
//negative 일때, 둘다 음수값일때 true 반환.
//나머지 곱해서 음수일때만, true;

	public String notString(String str) {
		  
		 if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
	//0~3글자길이를 가지고, not이랑 비교해서 true 면 그대로 반환./
	//아니면 "not "+str 로 반환.
	
public String missingChar(String str, int n) {
		
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
	}


	
	

//그냥 n의 범위를 정해주는 함수를 만드는 거였음.
//substring으로 시작과 끝단어를 지정해주고 마지막것두 뽑기위해
//n+1을 통해 마지막 값도 뽑아줌.



public String front3(String str) {
	int len = str.length(); //len으로 길이 찾기

	String front = str; //front 문자설정

	if (len >= 3) //글자길이가 3이상일때,
	{
		front = str.substring(0, 3); //첫글자부터 3번째 글자까지 뽑는다.
	}

	String res = "";
	int i = 0;
	while (i < 3) {
		res += front;
		i++;
	}
	//while 문 0,1,2 총 세번 돌아갈 동안 front+front+front로 뽑아냄.

	return res;
	}
}



