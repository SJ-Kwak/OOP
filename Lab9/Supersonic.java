//서브클래스
public class Supersonic extends Airplane {//일반 + 초음속 비행 모드
	public static final int NORMAL = 1;//상수 선언
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;//flyMode=1;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행!!!");
		}else {
			super.fly();	
		}
	}
	
	
}
