//구현 클래스 생성
public class SamsungPhone extends PDA implements PhoneInterface {
	//PhoneInterface의 모든 추상 메소드 구현
	//인터페이스 구현: implements 키워드 사용
	//PDA 상속
	
	//인터페이스 추상 메소드의 실체 메소드 선언
	@Override
	public void sendCall() {
		System.out.println("따르릉!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요!!");
	}
	
	//메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불 켜졌어요!!!");
	}
	
	public void schedule() {
		System.out.println("일정관리!!!!");
	}

}
