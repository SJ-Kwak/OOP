import java.util.Scanner;
public class Coprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("�� ���� ���� �ٸ� �ڿ����� �Է��ϼ���: ");
		a=s.nextInt();
		b=s.nextInt();
		
		int i, check=0, temp;
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		
		if(a<b)
			for(i=2;i<=b;i++)
				if(a%i==0&&b%i==0) //a�� b�� ���� ���� ������ �� �������� 0�� �Ǹ� ���μҰ� �ƴ�.
					check++;//check++���ֱ�. check==0�� ��쿡 ���μ�.
			
		if(check==0)
			System.out.println("�� ���� ���μ��Դϴ�.");
		else
			System.out.println("���μҰ� �ƴմϴ�.");
		
		s.close();

	}

}
