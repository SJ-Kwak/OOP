
public class Demo1 {

	public static void main(String[] args) {
		int i=13;
		Integer ii = Integer.valueOf(i);//Integer 클래스. 기본 타입 정수형 변수 i를 Integer 클래스 객체 ii로 변환.
		System.out.println(i);
		System.out.println(ii.floatValue());//실수값 구하기
		System.out.println((float)i);//윗 줄과 같은 역할

	}

}
