//Circle 클래스 - 필드, 메소드 작성
//라이브러리 클래스. 실행 클래스 아니므로 메인 메소드 기능 필요 없음
public class Circle {
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드
	
	public Circle() {//매개변수가 없는 생성자
		radius = 1;
		name = ""; //null값 초기화
	}
	
	public Circle(int r, String n) {//매개변수가 있는 생성자
		radius = r; //정수형 매개변수로 필드 초기화
		name = n; //문자형 매개변수로 필드 초기화
	}
	//생성자 여러 개 작성 가능. 매개변수 개수와 타입만 다르면 됨.
	//생성자: 객체 정의할 때 자동으로 호출되는 메소드
	//생성자 리턴 타입 지정 불가. 어떤 리턴타입도 선언 불가. void를 리턴타입으로 지정해서도 안 됨
	
	public double getArea() { //멤버 메소드
		return 3.14*radius*radius;
	}

}
