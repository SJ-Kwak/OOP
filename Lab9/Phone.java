//추상 클래스
public abstract class Phone {
	//필드
	public String owner; //소유자
	//생성자
	public Phone(String owner) {//매개변수 한 개
		this.owner=owner;//초기화
	}
	//메소드
	public void turnOn() {
		System.out.println("전원 On!");
	}
	public void turnOff() {
		System.out.println("전원 Off!!");
	}
}
