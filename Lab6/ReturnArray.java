import java.util.Scanner;
public class ReturnArray {//�迭 ���� �޼ҵ�
	static int[] iArray(int n) {
		int[] a = new int[n];//�迭 ����
		for(int i=0;i<n;i++)//�迭 �ʱⰪ ����, �迭 ���Ұ� ����
			a[i]=i;
		return a;//�迭 a ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���(����) �� �Է�: ");
		int n=s.nextInt();
		int[] x=iArray(n);//�迭 x ���� ��, iArray �޼ҵ� ȣ��.
		
		for(int i=0;i<n;i++)
			System.out.println("x["+i+"]="+x[i]);
		s.close();		
		
	}

}
