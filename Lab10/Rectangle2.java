//서브 클래스. 실체 클래스
public class Rectangle2 extends DObject {
	public Rectangle2(int w) {//매개변수 한 개인 생성자
		super(w,w);
	}
	
	public void ComputeArea() {//메소드
		area=width*width;//정사각형 면적 계산
	}
	@Override
	public void show() {//오버라이드된 추상메소드 구현
		// TODO Auto-generated method stub
		System.out.print("Rectangle2: ");
		System.out.println(width+" "+height+" "+area);
	}

}
