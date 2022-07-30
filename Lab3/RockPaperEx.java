import java.util.Scanner;//��ĳ�� Ŭ���� ��� ����
public class RockPaperEx {
	//��� ����. ���� �տ� final Ű���� ���̸� ����� ����.
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2)�� �����ϼ���: ");
		int user = s.nextInt();
		int computer = (int)(Math.random()*3);//computer�� ������ ������ ����
		//Math.random �޼ҵ�: math Ŭ���� �Ҽ�. java �ֻ��� Ŭ���� object ���� ��ġ. ���� import�� �ʿ�x. 
		//�Ϲ������� 0�̻� 1�̸��� �ε� �Ҽ��� ���� �޼ҵ�. => 0.0�� ���ų� ũ�� 1.0���� ���� �� ����.
		//Math.random()*3: ������ ���� ���� ���� 3�� ����. 0,1,2 3���� �� �� �������� ���� ����. n���� ���� �����Ϸ��� n�� ���ϸ� ��. 
		//�ε� �Ҽ������� ������ �Ǽ����� ĳ���� ������ ����Ͽ� (int)�� �տ� �ٿ��ָ鼭 ���������� �ٲ���.
		
		if(user==0)System.out.print("����");//���� if-else��
		else if(user==1)System.out.print("����");
		else System.out.print("��");
		
		if(computer==0)System.out.print(": ���� ");
		else if(computer==1)System.out.print(": ���� ");
		else System.out.print(": �� ");
		
		if(user==computer)
			System.out.println("���׿�!");
		else if(user==(computer+1)%3)//0�� 1���� ����, 1�� 2���� ����, 2�� 0���� ����.
			System.out.println("�̰�׿�!");
		else
			System.out.println("��Ÿ���� ���̱���!");
		s.close();
	}

}
