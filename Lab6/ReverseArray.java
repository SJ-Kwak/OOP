import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();//���� ��ü ����
		Scanner stdIn = new Scanner(System.in);//��ĳ�� ��ü ����
		
		System.out.print("��� ��: ");
		int n = stdIn.nextInt();//��� �� �Է�
		int[] a = new int[n];//�迭 ����
		
		for(int i=0;i<n;i++) {
			a[i]=10+rand.nextInt(90);//0�̻� 90�̸��� ���� �߻�+10�� ���� 1~100������ ���� ����
			//�迭 ���ҿ� ����� �Է� �����͸�ŭ�� ������ �����ϰ� �߻���Ŵ
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		for(int i=0;i<n/2;i++) {//�������� �ٲٱ�. n/2��ŭ�� �ݺ�
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
		System.out.println("��Ҹ� �������� ����");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		stdIn.close();

	}

}
