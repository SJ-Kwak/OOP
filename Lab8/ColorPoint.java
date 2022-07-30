//서브 클래스
public class ColorPoint extends Point {//Point 상속받은 ColorPoint 선언
	String color;//점의 색
	
	/*void setColor(String color) {
		this.color=color;
	}*/
	
	public ColorPoint(int x,int y,String color) {//매개변수 3개 생성자
		super(x,y);//슈퍼 클래스 Point의 매개변수 2개인 생성자 호출
		this.color=color;
	}
	
	void showColorPoint() {//컬러와 좌표 출력
		System.out.print(color);
		showPoint();//Point 클래스의 showPoint() 호출
	}

}
