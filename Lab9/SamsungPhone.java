//���� Ŭ���� ����
public class SamsungPhone extends PDA implements PhoneInterface {
	//PhoneInterface�� ��� �߻� �޼ҵ� ����
	//�������̽� ����: implements Ű���� ���
	//PDA ���
	
	//�������̽� �߻� �޼ҵ��� ��ü �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("������!");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��!!");
	}
	
	//�޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ �� �������!!!");
	}
	
	public void schedule() {
		System.out.println("��������!!!!");
	}

}
