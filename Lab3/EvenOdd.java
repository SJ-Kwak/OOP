import java.util.Scanner;//��ĳ�� ��� ����
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;//���� ����
		Scanner s = new Scanner(System.in);//��ĳ�� Ŭ���� ��ü ����
		System.out.println("�����Է�: ");//��¹��� �̿��Ͽ� �Է¸޼��� �ۼ�
		num=s.nextInt();//���� �Է��� �о����
		
		if(num%2==0) {
			System.out.println("¦��!!");
		}
		else {
			System.out.println("Ȧ��!!");
		}
		s.close();
	}

}
