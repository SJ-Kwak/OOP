//���� ����.
//�߻� Ŭ����. ���� Ŭ����
public abstract class DObject {
	int width, height;//�ʵ� ����
	double area;
	
	public DObject(int w, int h) {//�Ű����� 2���� ������
		width=w;
		height=h;
	}
	
	public void ComputeArea() {
		area=width*height;
	}
	
	public abstract void show(); //�߻� �޼ҵ�: �޼ҵ� ���𹮸� �ְ� ���� ������ ���� �ڵ�. �߻� Ŭ���� �������� ���� ����
}
