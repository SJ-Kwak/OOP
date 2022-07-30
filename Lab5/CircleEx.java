//실행클래스
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "자바피자"); //객체 생성 및 초기화
		
		double area = pizza.getArea();//메소드 호출.
		System.out.println(pizza.name + "의 면적: "+area);
				
		Circle donut = new Circle(); //Circle 객체 생성 및 초기화
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적: "+area);
	}

}
