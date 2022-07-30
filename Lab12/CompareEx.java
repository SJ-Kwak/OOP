import java.util.*;
public class CompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));//line별로 구분
		String s1=sc.next();
		String s2=sc.next();
		
		//StringTokenizer 클래스는 java.util 패키지 import 해야함
		StringTokenizer st1=new StringTokenizer(s1);
		StringTokenizer st2=new StringTokenizer(s2);
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {//스트링에 token이 남아있으면 true
			if((st1.nextToken()).compareTo(st2.nextToken())==0)//다음 토큰 반환
				//st1의 토큰과 st2의 토큰 비교. 둘이 같으면 0
				System.out.println("같다");
			else System.out.println("다르다");
		}
		
		if(st1.hasMoreTokens())//s1에 토큰이 남아있으면 s1이 길다
			System.out.println("s1이 길다");
		else if(st2.hasMoreTokens())//s2에 토큰이 남아있으면 s2가 길다
			System.out.println("s2가 길다");
		sc.close();
	}

}
