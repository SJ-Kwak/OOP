
public class Demo4 {

	public static void main(String[] args) {
		char c[]= {'4','h','1','8','a','x','7'};//문자 배열
		String s[]= {"4","-3","1","8","-10","-5","7"};//문자열 배열
		
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i]))//문자가 숫자이면 true 반환
				System.out.println(c[i]);
		}
		System.out.println();
		for(int i=0;i<s.length;i++) {
			if(Integer.parseInt(s[i])>0)//양의 정수만 출력. 문자열을 10진수로 변환
				System.out.println(s[i]);
		}
	}

}
