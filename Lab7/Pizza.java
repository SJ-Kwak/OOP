//���̺귯�� Ŭ����
public class Pizza {
	private String toppings;
	static int count=0; //static ���� ����
	//���� ����: Ŭ���� �� �ϳ��� �����Ǵ� ����. ���� �տ� static ���̱�
	//���� ���� ���� x. �ڹ�: ��� ������ Ŭ���� �ܺο� ������ �� ����.
	//���� ���� �ʿ��� �� ���� ���� ����ϸ� ������ ������ ��.
	
	public Pizza(String toppings) {
		this.toppings=toppings;
		count++;
	}
}
