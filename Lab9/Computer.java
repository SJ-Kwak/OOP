//����Ŭ����
public class Computer extends Calculator {

	//�޼ҵ� �������̵�. source - override/implement methods
	//������ �޼ҵ� �ڵ� ���� ���.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer�� areaCircle()!!");
		return Math.PI*r*r;//mathŬ����. �ڹ� ǥ�� api
	}
}
