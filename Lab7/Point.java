//���̺귯�� Ŭ����
public class Point {
	private double x,y;//getter, setter �޼ҵ� �ʿ�
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public Point(double n) {
		this(n,n);
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}
	
	public double getX() {
		return x;
	}

	public void showPoint() {
		System.out.println(x+","+y+" ");
	}

}
