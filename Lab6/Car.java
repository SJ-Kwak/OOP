//���̺귯�� Ŭ����
class Car {
	//�ʵ�: ��ü�� ���� ������ ����. ������, �޼ҵ� ��ü���� ���. ��ü �Ҹ���� �ʴ� ��, ��ü�� �Բ� ����.
	private String name;//�̸�
	private int width;  //�ʺ�
	private int height; //����
	private int length; //����
	private double x;	//���� ��ġ x��ǥ
	private double y;	//���� ��ġ y��ǥ
	private double fuel;//���� ����
	//�ʱⰪ ���� �� �� �ʵ�� �ڵ����� �ʱⰪ ����. int: 0, double 0.0, boolean: false, ����Ÿ�� �迭, string: null
	                    
	Car(String name, int width, int height, int length, double fuel){//������ ����. �Ű����� 5��.
		this.name=name; this.width=width; this.height=height;//this�� �����Ͽ� Ŭ���� ���� field�� access�� �� �ֵ��� ��.
		this.length=length; this.fuel=fuel;
		x=y=0.0;//������ġ��ǥ 0,0���� ����.
	}
	double getX() {return x;}	//�޼ҵ� ����. ���� ��ġ x��ǥ ���
	double getY() {return y;}	//���� ��ġ y��ǥ ���
	double getFuel() {return fuel;} 	//���� ���� ���
	
	void show() {//�ڵ��� ���� ǥ�� �޼ҵ�
		System.out.println("�̸�: "+name);
		System.out.println("�ʺ�: "+width+" ����: "+height+" ����: "+length);
	}
	
	boolean move(double dx, double dy) {//�̵� �޼ҵ�.
		double dist=Math.sqrt(dx*dx+dy*dy);//�̵��Ÿ�. math.sqrt: �μ� ������ ��ȯ �޼ҵ�
		if(dist>fuel)
			return false;//�̵� �Ұ�. ���� ����
		else {
			fuel-=dist;//�̵� �Ÿ���ŭ ���� ����
			x+=dx;
			y+=dy;
			return true;//�̵� �Ϸ�
		}
	}
}
