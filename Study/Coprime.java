import java.util.Scanner;
public class Coprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("두 개의 서로 다른 자연수를 입력하세요: ");
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
				if(a%i==0&&b%i==0) //a와 b를 같은 수로 나눴을 때 나머지가 0이 되면 서로소가 아님.
					check++;//check++해주기. check==0일 경우에 서로소.
			
		if(check==0)
			System.out.println("두 수는 서로소입니다.");
		else
			System.out.println("서로소가 아닙니다.");
		
		s.close();

	}

}
