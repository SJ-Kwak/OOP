//���̺귯��Ŭ���� ���, ���� Ŭ����, ���� Ŭ����
public class ColoredRectangle extends Rectangle {//���
	String color;//���ڿ� �ʵ� ����
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		//shapeŬ������ rectangleŬ������ ��� ��� ��� ����
		super(x,y,width,height);//rectangle Ŭ������ ������ ȣ��.
		System.out.println("ColoredRectangle()");
		this.color=color;
	}
	
	public static void main(String[] args) {
		ColoredRectangle obj=new ColoredRectangle(10,20,20,20,"red");//������ ȣ��� ���ÿ� �ʱ�ȭ
		//System.out.println(obj);
	}

}
