//���� Ŭ����
public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();//dog Ŭ������ sound�޼ҵ� ȣ��
		cat.sound();//cat Ŭ������ sound�޼ҵ� ȣ��
		System.out.println("========");
		
		Animal animal = null;
		animal = new Dog();
		//��ĳ����: ���� Ŭ���� ��ü�� ���� ���۷����� ���� Ŭ���� Ÿ������ ��ȯ.
		//����Ŭ������ ���۷����� ����Ŭ������ ����Ű�� ��.
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("========");

	}

}
