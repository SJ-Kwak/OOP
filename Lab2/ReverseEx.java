import java.util.Scanner;
public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int i;
		
		System.out.print("���ڿ��� �Է��� �ּ���!: ");
		str=s.nextLine();//�� �� ��ü �Է� ����
		
		for(i=str.length()-1;i>=0;i--) {//�� �ں��� �ձ��� ���. str.length �޼ҵ�: ���ڿ� ���� ��ȯ
			System.out.printf("%c",str.charAt(i));//str.charAt(i): ���ڿ��� ��ġ�� �� ���� ��ȯ. i: ���ڿ� ��ġ
		}
		System.out.println();
		s.close();
	}

}
