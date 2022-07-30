//서브클래스
public class Computer extends Calculator {

	//메소드 오버라이딩. source - override/implement methods
	//재정의 메소드 자동 생성 기능.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle()!!");
		return Math.PI*r*r;//math클래스. 자바 표준 api
	}
}
