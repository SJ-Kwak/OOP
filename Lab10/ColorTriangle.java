//���� Ŭ����. ��ü Ŭ����
public class ColorTriangle extends DObject {

	String color;//�ʵ�
	
	public ColorTriangle(int w, int h, String c) {//������. �Ű����� 3��.
		super(w,h);//����Ŭ���� ������ �״�� ���
		color=c;//colortriangle Ŭ������ �ʵ带 �Ű�������.
	}
	
	public void ComputeArea() {//�޼ҵ�
		area=(width*height)/2.0;
	}
	
	@Override
	public void show() {//�������̵�� �߻�޼ҵ� ����
		// TODO Auto-generated method stub
		System.out.print("ColorTriangle: ");
		System.out.println(width+" "+height+" "+area+" "+color);
	}

}
