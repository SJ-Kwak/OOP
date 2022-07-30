//실행 클래스
public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();//dog 클래스의 sound메소드 호출
		cat.sound();//cat 클래스의 sound메소드 호출
		System.out.println("========");
		
		Animal animal = null;
		animal = new Dog();
		//업캐스팅: 서브 클래스 객체에 대한 레퍼런스를 슈퍼 클래스 타입으로 변환.
		//슈퍼클래스의 레퍼런스로 서브클래스를 가리키게 함.
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("========");

	}

}
