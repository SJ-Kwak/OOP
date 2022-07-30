/*hw1 2076016 ������*/

import java.util.InputMismatchException;//exception file import
import java.util.Scanner;//��ĳ�� ��ü ����
public class RockScissorPaper {
	
	//��� ����. ���� �տ� final Ű���� ���̸� ����� ����.
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 0;//������ ��� �������� ������ �����ϴ� ���� ���� ���� �� �ʱ�ȭ
		int user = 0;//����� �Է°� ���� ���� �� �ʱ�ȭ
		
		while(true) {//���������� ������ ��� ����ǵ��� ��.
			int computer = (int)(Math.random()*3);//computer�� ������ ������ ����
			//�Ϲ������� 0�̻� 1�̸��� �ε� �Ҽ��� ���� �޼ҵ�. => 0.0�� ���ų� ũ�� 1.0���� ���� �� ����.
			//������ �� ���� ���� 3�� ����. 0,1,2 3���� �� �� �������� ���� ����.
			//�Ǽ����� ĳ���� �����ڸ� ���� ���������� ������ �� ��ȯ.
			
			while(true) {//���������� ���� ���� �ݺ�
				try {//�Է°� ���� ó��
					System.out.print("����(0), ����(1), ��(2)�� �����ϼ���: ");
					user = s.nextInt();
				}
				catch(InputMismatchException e) {//���� �Է� �� ����ó��
					System.out.println("���ڸ� �Է����ּ���.");
					s.nextLine();//���� �Է½�Ʈ���� �����ִ� ��ū�� ����. ���� �Է� ��, ���� �߻��̴ϱ� �߸� �Էµ� ���ڿ��� �����.
					continue;//�ٽ� �Է¹����� ����
				}
				
				switch(user) {//if���� switch������ ����. ����� �� ǥ��
				case 0: 
					System.out.print("����");
					break;
				case 1: 
					System.out.print("����");
					break;
				case 2: 
					System.out.print("��");
					break;
				}
				
				switch(computer) {//if���� switch������ ����. ��ǻ�� �� ǥ��
				case 0: 
					System.out.print(": ���� ");
					break;
				case 1: 
					System.out.print(": ���� ");
					break;
				case 2: 
					System.out.print(": �� ");
					break;
				}
				
				if(user==computer)//���������� ���� ����
					System.out.println("���׿�!");
				else if(user==(computer+1)%3)//0�� 1���� ����, 1�� 2���� ����, 2�� 0���� ����.
					System.out.println("�̰�׿�!");
				else
					System.out.println("��Ÿ���� ���̱���!");
				
				break;//���������� ���� ���� �ݺ��� ������
			}
			
			while(true) {//���������� ���� ����� ���� ����
				try {
					System.out.print("������ ����Ͻðڴٸ� ���� 1��, �����Ͻðڴٸ� ���� 2�� �����ּ���: ");
					choice = s.nextInt();//��ĳ�� ��ü�� ���� ���ð� �Է�
				}
				catch(InputMismatchException e) {//���� �Է� ��, ����ó��
					System.out.println("���ڸ� �Է����ּ���.");
					s.nextLine();
					continue;//�ٽ� ����� ���� choice���� �Է°� �ޱ�
				}
				break;//���������� ���� ����� ���� �ݺ��� ������				
			}
			
			if(choice==1)//������� ���ϸ�
				continue;//�ٽ� ��ǻ�� ���� �������� ���ư�
			else if(choice==2) //������� ������ ������
				break;//���������� ���� ���� ����. �ݺ��� ������
			
		}
		System.out.println("���������� ���� ����");
		s.close();//��ĳ�� ��ü ����
	}
}
