//���� Ŭ����
public class CircleEX {

	public static void main(String[] args) {
		Circle pizza=new Circle(10,"�Ը��� ����");//��ü ����. �ʱ�ȭ
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ����: "+area);
		
		Circle donut=new Circle();
		donut.name="���ĸ� ����";//donut �̸� ����
		area=Circle.PI*donut.radius*donut.radius;//���� ���
		//radius�� ���� ���� �� ������ Circle�޼ҵ��� radius�� 2 �ҷ���
		System.out.println(donut.name+"�� ����: "+area);
	}
}