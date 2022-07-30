//실행 클래스
public class MethodSampleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample a=new MethodSample();
		int i=a.getSum(1, 2);//매개변수 2개인 정수형 getSum 호출
		int j=a.getSum(1,2,3);//매개변수 3개인 정수형 getSum 호출
		double k=a.getSum(1.1, 2.2);//매개변수 2개인 실수형 getSum 호출
		
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.printf("k=%.2f",k);
	}

}
