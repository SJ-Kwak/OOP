//���� Ŭ����
public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(1,2);//Point ��ü ����=>�Ű����� 2���� ������ ȣ��
		p.set(1, 2);//Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp=new ColorPoint(3,4,"blue");//ColorPoint ��ü ����=>�Ű����� 3���� ������ ȣ��
		//cp.set(3, 4);//Point Ŭ������ set() ȣ�� 
		//cp.setColor("blue");//ColorPoint Ŭ������ setColor() ȣ��
		cp.showColorPoint();//�÷��� ��ǥ ���
	}
}