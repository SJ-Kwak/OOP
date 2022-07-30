//서브클래스
public class Student extends Person {
	void set() {
		age=22;
		name="김이화";
		height=167;
		setWeight(45);//private weight
	}
	
	void showStudent() {
		System.out.println("age: "+age);
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("weight: "+getWeight());//private weight
	}
}
