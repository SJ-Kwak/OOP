//���� Ŭ����. ��ü Ŭ����
public class Rectangle extends DObject {
	public Rectangle(int w, int h) {//������
		super(w,h);//����Ŭ���� ������ ���
	}
	
	public void ComputeArea() {//�޼ҵ�
		area=width*height;
	}
	
	@Override
	public void show() {//�������̵�� �߻� �޼ҵ� ����
		// TODO Auto-generated method stub
		System.out.print("Rectangle: ");
		System.out.println(width+" "+height+" "+area);
	}

}
