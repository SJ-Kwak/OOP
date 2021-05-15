import java.util.Scanner;
public class SmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("서로 다른 정수 세 개를 입력하세요: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a<b&&a<c)
			if(b<c)
				System.out.printf("%d %d %d",a,b,c);
			else
				System.out.printf("%d %d %d",a,c,b);
		else if(b<a&&b<c)
			if(a<c)
				System.out.printf("%d %d %d",b,a,c);
			else
				System.out.printf("%d %d %d",b,c,a);
		else if(c<a&&c<b)
			if(a<b)
				System.out.printf("%d %d %d",c,a,b);
			else
				System.out.printf("%d %d %d",c,b,a);
		
		s.close();

	}

}
