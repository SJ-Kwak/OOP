//����Ŭ����
public class Point {
	int x,y;//�� �� �����ϴ� x,y ��ǥ
	
	public Point() {//�⺻ ������
		this.x=this.y=0;
	}
	//�⺻ ������ ���� �Ŀ� �Ű����� ���� ������ �ۼ��ϱ�.
	
	public Point(int x,int y) {//�Ű����� 2�� ������
		this.x=x;
		this.y=y;
	}
	
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void showPoint() {//�� ��ǥ ���
		System.out.println("("+x+","+y+")");
	}

}
