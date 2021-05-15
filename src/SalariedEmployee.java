
public class SalariedEmployee extends Employee {
	double salary;
	
	public SalariedEmployee(String name, String phonenum) {
		super(name,phonenum);
	}
	
	void show() {
		showinfo();
		System.out.println("SalariedEmployee_salary: "+salary);
	}
}
