/*hw2 컴퓨터공학전공 2076016 곽서진*/
//#2-1
//Account 클래스
public class Account {
	String owner;//사용자 이름
	int balance;//잔고
	double rate;//연이율
	
	public Account(String owner, int balance, double rate) {//사용자 이름, 예금액, 연이율
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	
	public Account(String owner, int balance) {//사용자 이름, 예금액
		this(owner, balance, 0.0);
	}
	
	public Account(String owner, double rate) {//사용자 이름, 연이율
		this(owner, 0, rate);
	}
	
	public int deposit(int amount) {//입금액 처리
		this.balance+=amount;
		return this.balance;//잔액 리턴
	}
	
	public int withdraw(int amount) {//출금액 처리
		this.balance-=amount;
		//System.out.println("출금까지 마친 금액: "+this.balance);
		return this.balance;//잔액 리턴
	}
	
	public double rate(double d) {//이자율 처리
		this.rate=d;
		return this.rate;//이자율 리턴
	}
	
	public int computeTotal(int month) {//이자계산액 처리
		/*for(int i=0;i<month;i++) {
			double interest=balance*(rate/12);
			System.out.println("interest: "+interest);
			balance=(int) (balance+interest);
			System.out.println("중간 balance "+balance+" 중간 rate: "+rate);
		}*/
		double b=balance;//정수형 변수 balance를 실수형 변수 b에 대입.
		for(int i=0;i<month-1;i++) {//month-1까지 반복.
			b=b*rate/12+b;//이자를 합한 잔액 계산
		}
		balance=(int)b;//balance다시 정수로 캐스트.
		double c=balance;//balance 실수형 변수 c로 재대입.
		c=c*rate/12+c;//마지막 계산.
		balance=(int) Math.round(c);//balance 다시 정수로 캐스트할 때 반올림 시행.
		//(int)는 실수=>정수 과정에서 소수점 아예 삭제.
		//Math.round()는 실수=>정수 과정에서 반올림하여 표현.
		/*for(int i=0;i<month;i++) {
			b=b*rate/12+b;
			balance=(int)b;
			//balance=(int)Math.round(b);
			System.out.println("중간 balance "+b+" 중간 rate: "+rate);
		}
		/*int i=0;
		do {
			balance=(int)(balance*(rate/12)+balance);
			System.out.println("중간 balance "+balance+" 중간 rate: "+rate);
			i++;
		}while(i!=5);*/
		//balance=(int)Math.round(b);
		//balance=(int)b;
		return balance;//잔액 반환
	}
	
	void showBalance() {//잔액 출력 메소드
		System.out.println("Balance = "+this.balance);
	}

	void showOwner() {//사용자 계정 출력 메소드
		System.out.println();
		System.out.println("Owner = "+this.owner);
	}
	
	void showRate() {//연이율 출력 메소드
		System.out.println("Rate = "+this.rate);
	}
	
	void showAll() {//사용자 계정, 잔액, 연이율 출력 메소드
		showOwner();
		showBalance();
		showRate();
	}
}
