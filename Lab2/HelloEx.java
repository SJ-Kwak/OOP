import java.util.Scanner;//��ĳ�� Ŭ���� ��� ����
public class HelloEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//��ĳ�� ��ü ����
		//new ������: ��ü ����. System.in: Ű����κ��� ���� ����Ʈ ����
		//��ĳ��: �̰͵��� �и��Ͽ�, ����, �Ǽ�, ���ڿ� ���·� ����
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = in.nextLine();//��ĳ�� Ŭ���� �޼ҵ�: �ؽ�Ʈ���� �޼ҵ�. ������ �Է� ��, �� �� ��ü�� �о����.
		System.out.println("�ȳ��ϼ���! "+name+"�� ������ �ݰ����ϴ�!");
		in.close();//��ĳ�� Ŭ���� ����� ������ ��� ����. system.in�� �Բ� ����.
		//�� �ڵ尡 ������ warning �׷��� �����ϴ� ������ ū ���� ����. �ڵ����� ����.
		//��ĳ�� ��ü �ϳ��� �����ϰ� �����ϴ� ���� �ٶ���. ��� �ϳ����� system.in ����.
	}

}
