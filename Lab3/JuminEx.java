import java.util.Scanner;//��ĳ�� Ŭ���� ��� ����
public class JuminEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte num = -1; //byte�� ����. �ֹι�ȣ: ������x. ������ -1�� �ʱ�ȭ ����
		short year = 0; //������� ����
		String gender = "";//���� ����. Null������ �ʱ�ȭ
		System.out.println("�ֹι�ȣ�� 7��° �ڸ��� �Է�: ");
		num=s.nextByte();//�Է¹��� ���ڰ� ũ�� ���� ��� byte�� ������ ����Ͽ� �޸� ���� ����ϴ� ���� ����
		
		//���� �Ǻ�
		switch(num){
			case 9:
			case 0:
				year = 1800;
				break;
			case 1:
			case 2:
				year = 1900;
				break;
			case 3:
			case 4:
				year = 2000;
				break;
			default: year = -1;//case�鿡 �ش���� �ʴ� ���
		}
		
		//���� �Ǻ�
		if(year!=-1) {
			gender = num %2 == 0 ? "����":"����";//���׿�����: ���ǿ����� Ȱ���Ͽ� ���ǹ�. ���ڸ� ¦���� ����, Ȧ���� ����
		}
		System.out.println(year+"���"+gender+"���Դϴ�!");
		
		s.close();

	}

}
