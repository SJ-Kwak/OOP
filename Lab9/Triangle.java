//서브 클래스. 실체 클래스.
public class Triangle extends DObject {//DObject 클래스 상속
	
	public Triangle(int w, int h) {//생성자
		super(w,h);//슈퍼클래스의 생성자 호출.
	}
	
	public void computeArea() {//삼각형 면적 계산 메소드
		area=(width*height)/2.0;//area가 double형 변수이기 때문에 2.0으로 나누어주기.
	}
	@Override
	public void show() {//오버라이드된 추상 메소드 구현
		// TODO Auto-generated method stub
		System.out.print("Triangle");
		System.out.println(width+" "+height+" "+area);

	}

}
