import java.util.Scanner;
public class ChangeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);//���θ޼ҵ� ���ο� ��ĳ�� ��ü ����
		
		int money, c1, c2, c3, c4;
		System.out.println("��ȯ�� �ݾ��� �Է�: ");
		money=s.nextInt();
		
		c1=money/500;
		money=money%500;
		
		c2=money/100;//���� 500���� ������ ���� �������� ������ money�� �ش�
		money=money%100;
		
		c3=money/50;
		money=money%50;
		
		c4=money/10;
		money=money%10;
		
		System.out.printf("\n �����==> %d��", c1);
		System.out.printf("\n ���==> %d��", c2);
		System.out.printf("\n ���ʿ�==> %d��", c3);
		System.out.printf("\n �ʿ�==> %d��", c4);
		System.out.printf("\n �ܾ� %d��", money);//������ money=money%10������ money�� �ش�
		
		s.close();
	}

}
