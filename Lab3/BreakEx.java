import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� ����!");
		
		while(true) {//���ǽ��� ���̸� ��� ����
			System.out.print(">>������ �Է� => ");
			String text = s.nextLine();//�� ���ڿ� �����ϴ� �� �� ��ü �Է� �� ���
			if(text.equals("exit"))//���ڿ� ��. string���� ������ �������� exit�� ���ϱ� ���� text.equlas ���
				break;
		}
		System.out.println("�����մϴ�!");
		s.close();
	}

}
