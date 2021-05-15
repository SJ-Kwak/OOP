import java.util.Scanner;
public class CommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("서로 다른 자연수 두 개를 입력하시오: ");
		a=s.nextInt();
		b=s.nextInt();
		
		int i, temp, gcd=1, lcd, num;
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		
		if(a<b)
			for(i=2;i<=b;i++)
				if(a%i==0&&b%i==0)
					gcd=i;
		
		lcd=(a*b)/gcd;
		
		num=1000/lcd;
		System.out.println("1~1000까지에서 공배수의 개수는 "+num+"입니다.");
		
		s.close();
		}

	}
