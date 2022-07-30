//라이브러리 클래스
public class Pizza {
	private String toppings;
	static int count=0; //static 변수 선언
	//정적 변수: 클래스 당 하나만 생성되는 변수. 변수 앞에 static 붙이기
	//전역 변수 개념 x. 자바: 모든 변수는 클래스 외부에 존재할 수 없다.
	//전역 변수 필오할 때 정적 변수 사용하면 나름의 역할을 함.
	
	public Pizza(String toppings) {
		this.toppings=toppings;
		count++;
	}
}
