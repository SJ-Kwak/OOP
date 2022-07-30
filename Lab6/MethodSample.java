//라이브러리 클래스
public class MethodSample {
	//메소드 오버로딩: 같은 이름의 메소드를 여러 번 정의.
	public int getSum(int i,int j) {
		return i+j;//리턴 타입은 메소드 오버로딩에 영향 주지 않음.
	}

	public int getSum(int i,int j,int k) {
		return i+j+k;
	}
	
	public double getSum(double i,double j) {
		return i+j;
	}
}
