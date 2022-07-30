import java.util.Scanner;
public class StringComparison {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));//line이 바뀔 때 스트링을 끊어준다
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
