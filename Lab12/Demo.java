import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{(a+b)*(c+d)+e}/{(f-(g-h))*(i+j)}";
		StringTokenizer st=new StringTokenizer(s,"{ } ( )", true);
		//괄호도 토큰으로 취급
		//{ } ( )을 구분 문자로 함. 중괄호와 소괄호 토큰으로 문자열을 여러 개로 구분
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
