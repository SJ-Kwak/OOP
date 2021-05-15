//#2-2
//실행 클래스 AccountEx
public class AccountEx {

	public static void main(String[] args) {
		
		Account a = new Account("Kim", 1000, 0.03);//객체 생성. 매개변수 3개인 생성자 호출
		Account b = new Account("Lee", 0.04);//객체 생성. 매개변수 string, double인 생성자 호출
		Account c = new Account("Park", 2000);//객체 생성. 매개변수 string, int인 생성자 호출
		
		a.showAll();
		a.deposit(300);
		a.withdraw(100);
		a.computeTotal(5);
		a.showOwner();
		a.showBalance();
		
		b.showAll();
		b.deposit(300);
		b.withdraw(100);
		b.computeTotal(5);
		b.showOwner();
		b.showBalance();
		
		c.rate(0.05);
		c.showAll();
		c.deposit(300);
		c.withdraw(100);
		c.computeTotal(5);
		c.showOwner();
		c.showBalance();
	}

}
