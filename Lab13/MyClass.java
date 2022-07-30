
public class MyClass<T> {//제네릭 클래스
	T a;
	public void set(T a) {
		this.a=a;
	}
	public void show() {
		System.out.println(a);
	}
}
