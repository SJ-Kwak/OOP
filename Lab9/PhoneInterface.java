//인터페이스 선언
public interface PhoneInterface {
	//인터페이스: 상수 필드, 추상 메소드만을 구성 멤버로 가짐
	//객체 생성할 수 없기 때문에 생성자 없음.
	/*(public static)*/ final int TIMEOUT = 10000;//상수 필드 선언. 상수 이름은 대문자로
	//public static 생략 가능. 위에처럼만 있어도 상수라고 생각하기.
	
	/*(public abstract)*/ void sendCall();//추상메소드
	//public abstract 생략 가능.
	void receiveCall();//추상메소드
	
	default void printLogo() {//메소드
		System.out.println("**Phone!**");
	}
}
