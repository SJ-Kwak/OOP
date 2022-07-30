//실체 클래스
public class Dog extends Animal {

	public Dog() {//생성자
		this.kind="포유류";
	}
	//자바의 annotation @~~~
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}
