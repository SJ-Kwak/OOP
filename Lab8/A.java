//슈퍼클래스
public class A {
	int a1, a2;
	
	public A() {//default 생성자 추가
		System.out.println("A");//이 생성자가 호출되었음을 알리는 출력문
	}
	/*생성자
	 * 1. 생성자의 메소드명=클래스 이름
	 * 2. 생성자 앞에 붙은 접근지정자는 반드시 public
	 * 3. 리턴값 x
	 */
	
	public A(int a1, int a2) {//추가된 매개변수 2개 생성자
		this.a1=a1;
		this.a2=a2;
	}
	/*public void setA(int a1, int a2) {//메소드 생성
		this.a1=a1;
		this.a2=a2;
	}*/
	
	public void showA() {//메소드 생성
		System.out.println(a1+","+a2);
	}
}
