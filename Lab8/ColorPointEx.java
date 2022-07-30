//실행 클래스
public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(1,2);//Point 객체 생성=>매개변수 2개인 생성자 호출
		p.set(1, 2);//Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp=new ColorPoint(3,4,"blue");//ColorPoint 객체 생성=>매개변수 3개인 생성자 호출
		//cp.set(3, 4);//Point 클래스의 set() 호출 
		//cp.setColor("blue");//ColorPoint 클래스의 setColor() 호출
		cp.showColorPoint();//컬러와 좌표 출력
	}
}
