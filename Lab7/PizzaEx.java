//실행 클래스
public class PizzaEx {

	public static void main(String[] args) {
		Pizza p1=new Pizza("Super Supreme");
		Pizza p2=new Pizza("Cheese");
		Pizza p3=new Pizza("Pepperoni");
		
		int n=Pizza.count;
		System.out.println("판매된 피자의 개수: "+n);
	}
}
