
public class GenDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<Integer> iob=new MyClass<Integer>();//integer Ŭ����
		iob.set(5);
		iob.show();
		
		MyClass<Double> dob=new MyClass<Double>();//double Ŭ����
		dob.set(10.0);
		dob.show();
		
		MyClass<Point> pob=new MyClass<Point>();//point Ŭ����
		pob.set(new Point(1,2));
		pob.show();
	}

}
