//�߻� Ŭ����
public abstract class Phone {
	//�ʵ�
	public String owner; //������
	//������
	public Phone(String owner) {//�Ű����� �� ��
		this.owner=owner;//�ʱ�ȭ
	}
	//�޼ҵ�
	public void turnOn() {
		System.out.println("���� On!");
	}
	public void turnOff() {
		System.out.println("���� Off!!");
	}
}
