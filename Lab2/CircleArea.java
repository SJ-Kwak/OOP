
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14; //원주율 상수 선언.
		//final: 변수의 값이 더이상 변경 x.
		double radius=10.2; //원의 반지름. 실수형 변수 선언.
		
		//원의 면적 계산
		double circleArea=radius*radius*PI;
		//PI 상수. 초기값으로 설정. Circlearea에 변수값 대입.
		
		//원의 면적 출력
		System.out.print("반지름"+radius+", ");
		System.out.println("원의 면적= "+circleArea);
	}

}
