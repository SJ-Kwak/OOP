
public class PointEx {
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		System.out.println(p1);
		System.out.println(p1.toString());//p1�� ����Ű�� ��ü�� ���ڿ��� ����
		System.out.println(p1.getClass());//p1�� ����Ű�� ��ü�� Ŭ����
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
	}
}
