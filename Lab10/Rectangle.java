//서브 클래스. 실체 클래스
public class Rectangle extends DObject {
	public Rectangle(int w, int h) {//생성자
		super(w,h);//슈퍼클래스 생성자 사용
	}
	
	public void ComputeArea() {//메소드
		area=width*height;
	}
	
	@Override
	public void show() {//오버라이드된 추상 메소드 구현
		// TODO Auto-generated method stub
		System.out.print("Rectangle: ");
		System.out.println(width+" "+height+" "+area);
	}

}
