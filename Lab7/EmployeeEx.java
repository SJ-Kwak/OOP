//���� Ŭ����
public class EmployeeEx {

	public static void main(String[] args) {
		Employee e1,e2,e3;
		e1=new Employee("����ȭ", 35000);
		e2=new Employee("���缮", 50000);
		e3=new Employee("������", 20000);
		
		int n=Employee.getCount();
		System.out.println("������ ���� ��: "+n);

	}

}
