//실행 클래스
public class PhoneEx {

	public static void main(String[] args) {
		//Phone phone = new Phone(); //객체 생성 불가
		
		SmartPhone smartphone = new SmartPhone("김이화");
		//실체 클래스니까 객체 생성 가능.
		
		smartphone.turnOn();
		smartphone.Search();
		smartphone.turnOff();

	}

}
