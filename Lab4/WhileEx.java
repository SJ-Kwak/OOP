import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0; // �Է� ���� ���� ī��Ʈ
		int sum=0; // �Է� ���� �ջ�
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է�: ");
		
		int n=s.nextInt();
		
		//-1 �Է� ��, while�� break
		while(n!=-1) {
			sum+=n;
			count++;
			n=s.nextInt();
		}
		
		if(count==0)
			System.out.println("�Էµ� ������ �����ϴ�");
		else {
			System.out.print("������ ������ "+count+"���̸�");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		s.close();

	}

}
