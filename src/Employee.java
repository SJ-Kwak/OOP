
public class Employee {
	String name;
	String phonenum;
	
	public Employee(String name, String phonenum) {
		this.name=name;
		this.phonenum=phonenum;
	}
	
	void showinfo() {
		System.out.print("name: "+name+"\nemployee_number: "+phonenum);
		System.out.println();
	}
}
