
public class EmployeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Sam","01");
		SalariedEmployee salaried=new SalariedEmployee("Bob","02");
		HourlyEmployee hourly=new HourlyEmployee("Kate","03");
		
		salaried.salary=900000;
		hourly.payPerHour=5900;
		hourly.workHour=6;
		
		employee.showinfo();
		salaried.show();
		hourly.show();

	}

}
