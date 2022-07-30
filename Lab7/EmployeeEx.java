//실행 클래스
public class EmployeeEx {

	public static void main(String[] args) {
		Employee e1,e2,e3;
		e1=new Employee("김이화", 35000);
		e2=new Employee("유재석", 50000);
		e3=new Employee("아이유", 20000);
		
		int n=Employee.getCount();
		System.out.println("현재의 직원 수: "+n);

	}

}
