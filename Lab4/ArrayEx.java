//����ڷκ��� 5���� ���ڸ� �Է¹޾� �迭�� ����. ���� ū ���� �հ� ���
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Array[]=new int[5];//�迭 ���� �� ����. �迭 ũ�� 5.
		int max=0, sum=0;//ū ��, �հ� ���� ���� �� �ʱ�ȭ
		
		System.out.println("5���� ���ڸ� �Է��ϼ���: ");
		for(int i=0;i<5;i++) {
			Array[i]=s.nextInt();//�迭�� ���ҿ� ���������� �Էµ� ������ ����
		}
		
		for(int i=0;i<5;i++) {
			sum+=Array[i];//�迭�� ���Ұ� �ջ�
			if(max<Array[i])//Array[i]�� ���� ���� ū ������ ũ��
				max=Array[i];//max�� Array[i]�� ����
		}
		System.out.println("���� ū ��: "+max);
		System.out.println("�հ�: "+sum);
		
		s.close();
		
	}

}
