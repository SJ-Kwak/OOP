//서브 클래스. 실체 클래스
public class ColorTriangle extends DObject {

	String color;//필드
	
	public ColorTriangle(int w, int h, String c) {//생성자. 매개변수 3개.
		super(w,h);//슈퍼클래스 생성자 그대로 사용
		color=c;//colortriangle 클래스의 필드를 매개변수로.
	}
	
	public void ComputeArea() {//메소드
		area=(width*height)/2.0;
	}
	
	@Override
	public void show() {//오버라이드된 추상메소드 구현
		// TODO Auto-generated method stub
		System.out.print("ColorTriangle: ");
		System.out.println(width+" "+height+" "+area+" "+color);
	}

}
