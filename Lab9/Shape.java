//라이브러리 클래스. 슈퍼 클래스
public class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {//매개변수 두 개인 생성자
		System.out.println("Shape()");
		this.x=x;
		this.y=y;
	}
	/*
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	*/
}
