//#2-2
//���� Ŭ���� AccountEx
public class AccountEx {

	public static void main(String[] args) {
		
		Account a = new Account("Kim", 1000, 0.03);//��ü ����. �Ű����� 3���� ������ ȣ��
		Account b = new Account("Lee", 0.04);//��ü ����. �Ű����� string, double�� ������ ȣ��
		Account c = new Account("Park", 2000);//��ü ����. �Ű����� string, int�� ������ ȣ��
		
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
