//�迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ���� �Է�. ��� ���ϱ�
import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Array[]=new int[4];//�迭 ���� �� ����
		int sum=0;
		
		System.out.println(Array.length+"���� ���� �Է��ϼ���: ");
		for(int i=0;i<Array.length;i++)
			Array[i]=s.nextInt();//�Է� ���� �迭�� ���������� ����
		
		for(int i=0;i<Array.length;i++)
			sum+=Array[i];//�迭�� ����� ������ �ջ�
		
		System.out.println("����� "+sum/Array.length+"�Դϴ�.");
		s.close();

	}

}
