import java.util.Scanner;//��ĳ�� Ŭ���� ��� ����
public class CoffeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		String order = s.next();//���ڿ� �Է¹���. next�޼ҵ�: �� ���ڿ� ����x. => ������ �Է� ��, ��ĭ �Է� x
		
		int price = 0;
		
		switch(order) {
		case "����������" :
		case "īǪġ��" :
		case "ī���" :
			price = 3500; break;
			
		case "�Ƹ޸�ī��" :
			price = 2000; break;
			
		default: System.out.println("�޴��� �����ϴ�!");			
		}
		
		if(price!=0) System.out.println(order+"�� "+price+"���Դϴ�!");
		s.close();
	}

}
