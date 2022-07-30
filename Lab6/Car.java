//라이브러리 클래스
class Car {
	//필드: 객체의 공유 데이터 저장. 생성자, 메소드 전체에서 사용. 객체 소멸되지 않는 한, 객체와 함께 존재.
	private String name;//이름
	private int width;  //너비
	private int height; //높이
	private int length; //길이
	private double x;	//현재 위치 x좌표
	private double y;	//현재 위치 y좌표
	private double fuel;//남은 원료
	//초기값 설정 안 된 필드는 자동으로 초기값 생성. int: 0, double 0.0, boolean: false, 참조타입 배열, string: null
	                    
	Car(String name, int width, int height, int length, double fuel){//생성자 선언. 매개변수 5개.
		this.name=name; this.width=width; this.height=height;//this로 설정하여 클래스 내의 field에 access할 수 있도록 함.
		this.length=length; this.fuel=fuel;
		x=y=0.0;//현재위치좌표 0,0으로 설정.
	}
	double getX() {return x;}	//메소드 생성. 현재 위치 x좌표 취득
	double getY() {return y;}	//현재 위치 y좌표 취득
	double getFuel() {return fuel;} 	//남은 연료 취득
	
	void show() {//자동차 스펙 표시 메소드
		System.out.println("이름: "+name);
		System.out.println("너비: "+width+" 높이: "+height+" 길이: "+length);
	}
	
	boolean move(double dx, double dy) {//이동 메소드.
		double dist=Math.sqrt(dx*dx+dy*dy);//이동거리. math.sqrt: 인수 제곱근 반환 메소드
		if(dist>fuel)
			return false;//이동 불가. 연료 부족
		else {
			fuel-=dist;//이동 거리만큼 연료 감소
			x+=dx;
			y+=dy;
			return true;//이동 완료
		}
	}
}
