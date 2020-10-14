package chap06.textbook.excercises.p19;

public class Account {

	private int balance =10000;
	static final int MIN_BALANCE =0;
	static final int MAX_BALANCE = 1000000;
	
	
	//Getter
	public int getBalance() {
		return balance;
	}

	//Setter
	public void setBalance(int balance) {
		if(balance<=MIN_BALANCE) {
			balance=this.balance;
			return;
		}else if(balance<=MAX_BALANCE){
			this.balance =balance;
			return;
		}else if(balance>=MAX_BALANCE) {
			balance=this.balance;
		}else {
			this.balance =balance;
		}
	}
	
	}



