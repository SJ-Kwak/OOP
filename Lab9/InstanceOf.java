//라이브러리 클래스
class Person1{}
class Student1 extends Person1{}
class Researcher1 extends Person1{}
class Professor1 extends Researcher1{}
//다중상속 불가 but 상속 횟수 제한x

public class InstanceOf {
	static void print(Person1 p) {
		if(p instanceof Person1) {//객체 p는 Person1의 타입인가. 단항연산자 instanceof
			System.out.print("Person1: ");
		}
		if(p instanceof Student1) {
			System.out.print("Student1: ");
		}
		if(p instanceof Researcher1) {
			System.out.print("Researcher1: ");
		}
		if(p instanceof Professor1) {
			System.out.print("Professor1: ");
		}
		System.out.println();
	}
}
