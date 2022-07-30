//라이브러리 클래스
public class Circle {
	int radius;
	String name;
	
	public static final double PI=3.14;//상수 지정
	
	public Circle() {//매개변수 없는 생성자
		this(2,"");
		//radius=2;
		//name="";
	}
	//생성자는 메소드와 유사한 형태를 갖고 있지만 클래스 이름으로 되어 있고 리턴 타입이 없음
	
	public Circle(int radius, String name) {//매개변수 2개
		this.radius=radius;//this 메소드 사용하여 중복 코드 줄이기
		this.name=name;
	}
	public double getArea() {
		return PI*this.radius*this.radius;
	}
}