//라이브러리 클래스 상속. 서브 클래스
public class Rectangle extends Shape {//상속
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);//부모클래스 생성자 명시적 호출. 무조건 첫 번째 줄에 작성
		System.out.println("Rectangle()");
		this.width=width;//매개변수로 입력받은 width,height 초기화
		this.height=height;
	}
	
	double calcArea() {//면적 계산 메소드
		return width*height;
	}
}
