//���̺귯�� Ŭ���� ���. ���� Ŭ����
public class Rectangle extends Shape {//���
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);//�θ�Ŭ���� ������ ����� ȣ��. ������ ù ��° �ٿ� �ۼ�
		System.out.println("Rectangle()");
		this.width=width;//�Ű������� �Է¹��� width,height �ʱ�ȭ
		this.height=height;
	}
	
	double calcArea() {//���� ��� �޼ҵ�
		return width*height;
	}
}
