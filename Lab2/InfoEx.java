import java.util.Scanner;
public class InfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸� ���� ���� ü�� ��ȥ ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���!");
		Scanner in = new Scanner(System.in);//��ĳ�� ��ü ����
		
		String name = in.next(); //���ڿ� ��ū �б� (�� �� ��ü�� �б� ���ϸ� nextline �޼ҵ� ���)
		System.out.println("�̸�: "+name);
		
		String city = in.next(); //���ڿ� ��ū �б�
		System.out.println("����: "+city);
		
		int age = in.nextInt(); //���� ��ū �б�
		System.out.println("����: "+age);
		
		double weight = in.nextDouble(); //�Ǽ� ��ū �б�
		System.out.println("ü��: "+weight);
		
		boolean single = in.nextBoolean(); //boolean ��ū �б� (true false�� �Է�)
		System.out.println("��ȥ ����: "+single);
		
		in.close();//��ĳ�� ��ü �ݱ�
	}

}
