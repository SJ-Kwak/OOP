//���� Ŭ����
public class ColorPoint extends Point {//Point ��ӹ��� ColorPoint ����
	String color;//���� ��
	
	/*void setColor(String color) {
		this.color=color;
	}*/
	
	public ColorPoint(int x,int y,String color) {//�Ű����� 3�� ������
		super(x,y);//���� Ŭ���� Point�� �Ű����� 2���� ������ ȣ��
		this.color=color;
	}
	
	void showColorPoint() {//�÷��� ��ǥ ���
		System.out.print(color);
		showPoint();//Point Ŭ������ showPoint() ȣ��
	}

}
