//���̺귯�� Ŭ����
public class Circle {
	int radius;
	String name;
	
	public static final double PI=3.14;//��� ����
	
	public Circle() {//�Ű����� ���� ������
		this(2,"");
		//radius=2;
		//name="";
	}
	//�����ڴ� �޼ҵ�� ������ ���¸� ���� ������ Ŭ���� �̸����� �Ǿ� �ְ� ���� Ÿ���� ����
	
	public Circle(int radius, String name) {//�Ű����� 2��
		this.radius=radius;//this �޼ҵ� ����Ͽ� �ߺ� �ڵ� ���̱�
		this.name=name;
	}
	public double getArea() {
		return PI*this.radius*this.radius;
	}
}