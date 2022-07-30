//실행 클래스
public class SupersonicEx {

	public static void main(String[] args) {
		Supersonic sa = new Supersonic();
		sa.takeoff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		//supersonic 클래스의 상수 supersonic=2 호출.
		//flymode=1 != supersonic=2 => 비행!!
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		//supersonic 클래스의 상수 normal=1 호출
		//flymode=1 == normal=1 => 초음속 비행!!!
		sa.fly();
		sa.land();

	}

}
