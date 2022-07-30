/*hw2 ��ǻ�Ͱ������� 2076016 ������*/
//#2-1
//Account Ŭ����
public class Account {
	String owner;//����� �̸�
	int balance;//�ܰ�
	double rate;//������
	
	public Account(String owner, int balance, double rate) {//����� �̸�, ���ݾ�, ������
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	
	public Account(String owner, int balance) {//����� �̸�, ���ݾ�
		this(owner, balance, 0.0);
	}
	
	public Account(String owner, double rate) {//����� �̸�, ������
		this(owner, 0, rate);
	}
	
	public int deposit(int amount) {//�Աݾ� ó��
		this.balance+=amount;
		return this.balance;//�ܾ� ����
	}
	
	public int withdraw(int amount) {//��ݾ� ó��
		this.balance-=amount;
		//System.out.println("��ݱ��� ��ģ �ݾ�: "+this.balance);
		return this.balance;//�ܾ� ����
	}
	
	public double rate(double d) {//������ ó��
		this.rate=d;
		return this.rate;//������ ����
	}
	
	public int computeTotal(int month) {//���ڰ��� ó��
		/*for(int i=0;i<month;i++) {
			double interest=balance*(rate/12);
			System.out.println("interest: "+interest);
			balance=(int) (balance+interest);
			System.out.println("�߰� balance "+balance+" �߰� rate: "+rate);
		}*/
		double b=balance;//������ ���� balance�� �Ǽ��� ���� b�� ����.
		for(int i=0;i<month-1;i++) {//month-1���� �ݺ�.
			b=b*rate/12+b;//���ڸ� ���� �ܾ� ���
		}
		balance=(int)b;//balance�ٽ� ������ ĳ��Ʈ.
		double c=balance;//balance �Ǽ��� ���� c�� �����.
		c=c*rate/12+c;//������ ���.
		balance=(int) Math.round(c);//balance �ٽ� ������ ĳ��Ʈ�� �� �ݿø� ����.
		//(int)�� �Ǽ�=>���� �������� �Ҽ��� �ƿ� ����.
		//Math.round()�� �Ǽ�=>���� �������� �ݿø��Ͽ� ǥ��.
		/*for(int i=0;i<month;i++) {
			b=b*rate/12+b;
			balance=(int)b;
			//balance=(int)Math.round(b);
			System.out.println("�߰� balance "+b+" �߰� rate: "+rate);
		}
		/*int i=0;
		do {
			balance=(int)(balance*(rate/12)+balance);
			System.out.println("�߰� balance "+balance+" �߰� rate: "+rate);
			i++;
		}while(i!=5);*/
		//balance=(int)Math.round(b);
		//balance=(int)b;
		return balance;//�ܾ� ��ȯ
	}
	
	void showBalance() {//�ܾ� ��� �޼ҵ�
		System.out.println("Balance = "+this.balance);
	}

	void showOwner() {//����� ���� ��� �޼ҵ�
		System.out.println();
		System.out.println("Owner = "+this.owner);
	}
	
	void showRate() {//������ ��� �޼ҵ�
		System.out.println("Rate = "+this.rate);
	}
	
	void showAll() {//����� ����, �ܾ�, ������ ��� �޼ҵ�
		showOwner();
		showBalance();
		showRate();
	}
}
