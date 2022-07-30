//라이브러리클래스 상속, 서브 클래스, 실행 클래스
public class ColoredRectangle extends Rectangle {//상속
	String color;//문자열 필드 설정
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		//shape클래스와 rectangle클래스의 모든 멤버 사용 가능
		super(x,y,width,height);//rectangle 클래스의 생성자 호출.
		System.out.println("ColoredRectangle()");
		this.color=color;
	}
	
	public static void main(String[] args) {
		ColoredRectangle obj=new ColoredRectangle(10,20,20,20,"red");//생성자 호출과 동시에 초기화
		//System.out.println(obj);
	}

}
