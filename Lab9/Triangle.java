//���� Ŭ����. ��ü Ŭ����.
public class Triangle extends DObject {//DObject Ŭ���� ���
	
	public Triangle(int w, int h) {//������
		super(w,h);//����Ŭ������ ������ ȣ��.
	}
	
	public void computeArea() {//�ﰢ�� ���� ��� �޼ҵ�
		area=(width*height)/2.0;//area�� double�� �����̱� ������ 2.0���� �������ֱ�.
	}
	@Override
	public void show() {//�������̵�� �߻� �޼ҵ� ����
		// TODO Auto-generated method stub
		System.out.print("Triangle");
		System.out.println(width+" "+height+" "+area);

	}

}
