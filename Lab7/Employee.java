//라이브러리 클래스
public class Employee {
	private String name;
	private double salary;
	
	private static int count=0;	//static 변수 선언
	
	public Employee(String n,double s) {
		name=n;
		salary=s;
		count++;	//정적 변수 count 증가
	}
	//객체 소멸 시에 호출되는 메소드
	protected void finalize() {//객체 소멸자 메소드. 참조하지 않는 객체나 메소드를 가비지 컬렉터가 heap영역 내에서 수거.
		count--;	//직원이 하나 줄어드는 것이므로 count를 하나 감소
	}
	//static method
	public static int getCount() {
		return count;
	}
}