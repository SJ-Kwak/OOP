//���� Ŭ����
import java.util.InputMismatchException;
import java.util.Scanner;
class BookEx {//���������� default

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookManagement books = new BookManagement();//books ��ü ����
		BookManagement info = new BookManagement("������","2021.05.09");//UserŬ���� Ȱ���Ͽ� info ��ü ����. �����ڸ� �̿��Ͽ� �ʱ�ȭ.
		int num = 0;//���� ��ȣ ����
		boolean run=true;//boolean ����
		
		info.showUser();
		while(run) {//run�� false�� �Ǳ� ������ ���ѷ���
			System.out.println("====================================");
			System.out.println("1. ���� ��� | 2. ���� ��� ��� | 3. ����");
			System.out.println("====================================");
			System.out.print("��ȣ�� �����ϼ���: ");
			try {
				num=s.nextInt();//���� ��ȣ �Է�
			}
			catch(InputMismatchException e) {//������ �ƴ� ���� �Է� �� ���� ó��
				System.out.println("1~3������ ������ �Է��ϼ���!");
				s.nextLine();
				continue;//�ٽ� ��ȣ �Է�
			}
			switch(num) {//switch�� ���
				case 1:
					books.registerBook();//���� ���. BookManagementŬ������ registerBook�޼ҵ� ȣ��.
					break;
				case 2:
					books.printBook();//���� ��� ���. printBook�޼ҵ� ȣ��
					break;
				case 3:
					System.out.println("���α׷� ����");
					run=false;//while���� ���ǽ��� run�� false�� �Ǹ� while�� break
					break;
				default:System.out.println("1���� 3 ������ ������ �Է��ϼ���!");
						
			}
		}
		s.close();
	}
}
