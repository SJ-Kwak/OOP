//���� Ŭ���� AccountModEx
public class AccountModEx {

	public static void main(String[] args) {
		Account[] a = new Account[3];//ũ�Ⱑ 3�� ��ü �迭 ����
		a[0] = new Account("Kim", 1000, 0.03);//0��° �ε���
		a[1] = new Account("Lee", 0.04);//1��° �ε���
		a[2] = new Account("Park", 2000);//2��° �ε���
		
		//a[0]�� �޼ҵ� ȣ��.
		a[0].showAll();
		a[0].deposit(300);
		a[0].withdraw(100);
		a[0].computeTotal(5);
		a[0].showOwner();
		a[0].showBalance();
		
		//a[1]�� �޼ҵ� ȣ��.
		a[1].showAll();
		a[1].deposit(300);
		a[1].withdraw(100);
		a[1].computeTotal(5);
		a[1].showOwner();
		a[1].showBalance();
		
		//a[2]�� �޼ҵ� ȣ��.
		a[2].rate(0.05);
		a[2].showAll();
		a[2].deposit(300);
		a[2].withdraw(100);
		a[2].computeTotal(5);
		a[2].showOwner();
		a[2].showBalance();

	}

}