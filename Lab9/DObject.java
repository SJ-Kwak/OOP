//도형 관리.
//추상 클래스. 슈퍼 클래스
public abstract class DObject {
	int width, height;//필드 선언
	double area;
	
	public DObject(int w, int h) {//매개변수 2개인 생성자
		width=w;
		height=h;
	}
	
	public void ComputeArea() {
		area=width*height;
	}
	
	public abstract void show(); //추상 메소드: 메소드 선언문만 있고 실행 내용이 없는 코드. 추상 클래스 내에서만 선언 가능
}
