//����Ŭ����
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "�ڹ�����"); //��ü ���� �� �ʱ�ȭ
		
		double area = pizza.getArea();//�޼ҵ� ȣ��.
		System.out.println(pizza.name + "�� ����: "+area);
				
		Circle donut = new Circle(); //Circle ��ü ���� �� �ʱ�ȭ
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ����: "+area);
	}

}
