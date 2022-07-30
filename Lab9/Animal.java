//추상 클래스
public abstract class Animal {
	public String kind;//문자열 필드 선언
	
	public void live() {
		System.out.println("호흡!");
	}
	public abstract void sound();//추상 메소드
	//어떤 소리를 내는지는 클래스별 사운드 메소드로 재정의할 예정. 상속, 오버라이딩.
}
