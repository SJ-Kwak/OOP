
public class Demo7 {

	public static void main(String[] args) {
		String a=new String ("   Hello, ");
		String b=new String("World!    ");
		
		//�� ���ڿ� ����
		a=a.concat(b);//������ ��Ʈ��(b)�� ���� ��Ʈ��(a) �ڿ� ������ ��Ʈ�� ��ȯ.
		//a+b�� �ܼ� ����. println(a+b)��� ǥ���ؾ� ���� ���·� ���
		//a.concat(b)�� a+b ������ ���ο� ��Ʈ�� a�� ����.
		System.out.println("���ڿ� ����");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� ���� �� ���� ���� ����
		a=a.trim();//��Ʈ�� �� ���� ���鹮�ڵ��� ������ ��Ʈ�� ��ȯ
		System.out.println("���ڿ� �� ���� ���� ����");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� ��ġ
		a=a.replace("o","###");//������ ����(o)�� ###���� ��ȯ�Ͽ� ��ȯ
		System.out.println("���ڿ����� o�� ###�� �ٲ�");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� �и�
		String s[]=a.split(",");//���ڿ� �迭 s ����. s�� ,�� �������� ������ ���ڿ� a�� ���۷����� ��.
		System.out.println("���ڿ��� �޸��� �и�");
		for(int i=0;i<s.length;i++)
			System.out.println("�и���"+i+"�� ���ڿ�: "+s[i]);
		System.out.println();
		
		//���� ��Ʈ�� a[3]~
		a=a.substring(3);//������ �ε���(3)���� �����ϴ� ���� ��Ʈ�� ��ȯ
		System.out.println("���ڿ��� �Ϻ� a[3]~��");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� ���� ����
		char c=a.charAt(2);//���ڿ�(a) �ӿ� ������ �ε���(2)�� �ִ� ���ڰ� c�� ��ȯ.
		System.out.println("���ڿ� ���� ���� a[2]");
		System.out.println(c);
		System.out.println();
		
		//��� �ҹ��ڷ� ��ȯ
		a=a.toLowerCase();
		System.out.println("�ҹ��ڷ� ��ȯ");
		System.out.println(a);
		System.out.println();
		
		//��� �빮�ڷ� ��ȯ
		a=a.toUpperCase();
		System.out.println("�빮�ڷ� ��ȯ");
		System.out.println(a);
		System.out.println();
	}

}
