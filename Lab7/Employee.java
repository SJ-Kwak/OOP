//���̺귯�� Ŭ����
public class Employee {
	private String name;
	private double salary;
	
	private static int count=0;	//static ���� ����
	
	public Employee(String n,double s) {
		name=n;
		salary=s;
		count++;	//���� ���� count ����
	}
	//��ü �Ҹ� �ÿ� ȣ��Ǵ� �޼ҵ�
	protected void finalize() {//��ü �Ҹ��� �޼ҵ�. �������� �ʴ� ��ü�� �޼ҵ带 ������ �÷��Ͱ� heap���� ������ ����.
		count--;	//������ �ϳ� �پ��� ���̹Ƿ� count�� �ϳ� ����
	}
	//static method
	public static int getCount() {
		return count;
	}
}