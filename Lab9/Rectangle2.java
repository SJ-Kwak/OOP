//���� Ŭ����. ��ü Ŭ����
public class Rectangle2 extends DObject {
	public Rectangle2(int w) {//�Ű����� �� ���� ������
		super(w,w);
	}
	
	public void ComputeArea() {//�޼ҵ�
		area=width*width;//���簢�� ���� ���
	}
	@Override
	public void show() {//�������̵�� �߻�޼ҵ� ����
		// TODO Auto-generated method stub
		System.out.print("Rectangle2: ");
		System.out.println(width+" "+height+" "+area);
	}

}
