//���̺귯�� Ŭ����
class Person1{}
class Student1 extends Person1{}
class Researcher1 extends Person1{}
class Professor1 extends Researcher1{}
//���߻�� �Ұ� but ��� Ƚ�� ����x

public class InstanceOf {
	static void print(Person1 p) {
		if(p instanceof Person1) {//��ü p�� Person1�� Ÿ���ΰ�. ���׿����� instanceof
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
