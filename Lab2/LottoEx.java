import java.util.Random;//class���� ���� ����.
public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int lucky=rand.nextInt(10);//0~9�� ����. 0�̻� 9������ �� �� �ϳ��� ������ �ʱ�ȭ��
		System.out.println("������ ����� ��ȣ��"+lucky+"�Դϴ�!");
	}
}
