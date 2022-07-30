//실체 클래스
public class SmartPhone extends Phone {//추상 클래스 상속
	//생성자
	public SmartPhone(String owner) {
		super(owner);//슈퍼클래스 생성자 호출
	}
	//메소드
	public void Search() {
		System.out.println("Internet 검색!!");
	}
}
