//서브 클래스
public class B extends A {//슈퍼클래스 A를 상속. A의 서브클래스
	int b1, b2;
	
	public B() {//생성자 생성
		System.out.println("B");
	}
	
	public B(int a1, int a2, int b1, int b2) {
		super(a1,a2);
		this.b1=b1;
		this.b2=b2;
	}
	
	/*void setB(int a1, int a2, int b1, int b2) {
		//this.a1=a1;
		//this.a2=a2;
		setA(a1,a2);
		
		this.b1=b1;
		this.b2=b2;
	}*/
	
	void showB() {
		showA();
		System.out.println(b1+","+b2);
	}
}
