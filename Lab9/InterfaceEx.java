//���� Ŭ����
public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		
		phone.printLogo();//phoneinterface�� �ִ� ��ü �޼ҵ� ȣ��.
		//samsungphone Ŭ������ �ִ� �޼ҵ� ȣ��
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		//samsungphone Ŭ����: PDA Ŭ���� ��ӹ޾ұ� ������ calculate�޼ҵ� ��� ����
		System.out.println("2+5="+phone.calculate(2,5));
		phone.schedule();
	}
}
