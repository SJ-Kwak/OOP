//�������̽� ����
public interface PhoneInterface {
	//�������̽�: ��� �ʵ�, �߻� �޼ҵ常�� ���� ����� ����
	//��ü ������ �� ���� ������ ������ ����.
	/*(public static)*/ final int TIMEOUT = 10000;//��� �ʵ� ����. ��� �̸��� �빮�ڷ�
	//public static ���� ����. ����ó���� �־ ������ �����ϱ�.
	
	/*(public abstract)*/ void sendCall();//�߻�޼ҵ�
	//public abstract ���� ����.
	void receiveCall();//�߻�޼ҵ�
	
	default void printLogo() {//�޼ҵ�
		System.out.println("**Phone!**");
	}
}
