import java.util.Scanner;
public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���: ");
		
		int sum=0;
		
		for(int i=0;i<5;i++){
			int n=s.nextInt();//���� �Է�
			
			if(n<=0)
				continue;//n�� ����� �ƴ� ��, �ٽ� int n=s.nextInt()������ goback. 
			else
				sum+=n;//����� ��� �ջ�
		}
		System.out.println("����� sum: "+sum);
		s.close();

	}

}
