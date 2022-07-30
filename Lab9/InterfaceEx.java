//실행 클래스
public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		
		phone.printLogo();//phoneinterface에 있는 실체 메소드 호출.
		//samsungphone 클래스에 있는 메소드 호출
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		//samsungphone 클래스: PDA 클래스 상속받았기 때문에 calculate메소드 사용 가능
		System.out.println("2+5="+phone.calculate(2,5));
		phone.schedule();
	}
}
