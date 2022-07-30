
public class PointEx {
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		System.out.println(p1);
		System.out.println(p1.toString());//p1이 가리키는 객체를 문자열로 리턴
		System.out.println(p1.getClass());//p1이 가리키는 객체의 클래스
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
	}
}
