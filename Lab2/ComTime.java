
public class ComTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4; //������ ���̻� ��ȭx. ���
		double distance = 40e12; //���� ǥ����� ����� �Ǽ��� ���ͷ�. e=10
		
		double time;
		
		time=distance/light_speed;
		
		double light_year = time / (60.0*60.0*24.0*365.0); //����: ���� 1�⿡ �����ϴ� �Ÿ�
		System.out.println("�ɸ��� �ð��� "+light_year+"����!");
	}

}
