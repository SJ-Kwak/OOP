
public class HourlyEmployee extends Employee {
	double payPerHour;
	double workHour;
	double salary;
	
	public HourlyEmployee(String name, String phonenum) {
		super(name,phonenum);
	}
	
	void show() {
		showinfo();
		salary=payPerHour*workHour*30;
		System.out.println("HourlyEmployee_Salary: "+salary);
	}
}
