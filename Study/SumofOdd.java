import java.util.Scanner;
public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("양의 정수 입력: ");
		num=s.nextInt();
		
		int sum=0, k;		
		for (int i=0;i<num;i++)
		{
			k=2*i+1;
			sum+=k;
			if(i<num-1)
				System.out.print(k+"+");
			else
				System.out.print(k+"="+sum);
		}
		s.close();

	}

}
