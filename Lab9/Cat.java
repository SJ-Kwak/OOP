
public class Cat extends Animal {
	public Cat() {//생성자
		this.kind="포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
