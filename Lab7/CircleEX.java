//실행 클래스
public class CircleEX {

	public static void main(String[] args) {
		Circle pizza=new Circle(10,"게맛살 피자");//객체 생성. 초기화
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적: "+area);
		
		Circle donut=new Circle();
		donut.name="양파링 피자";//donut 이름 지정
		area=Circle.PI*donut.radius*donut.radius;//면적 계산
		//radius값 따로 지정 안 했으니 Circle메소드의 radius값 2 불러옴
		System.out.println(donut.name+"의 면적: "+area);
	}
}