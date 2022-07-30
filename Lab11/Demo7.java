
public class Demo7 {

	public static void main(String[] args) {
		String a=new String ("   Hello, ");
		String b=new String("World!    ");
		
		//두 문자열 연결
		a=a.concat(b);//지정된 스트링(b)를 현재 스트링(a) 뒤에 덧붙인 스트링 반환.
		//a+b는 단순 연결. println(a+b)라고 표시해야 붙은 형태로 출력
		//a.concat(b)는 a+b 형태의 새로운 스트링 a를 생성.
		System.out.println("문자열 연결");
		System.out.println(a);
		System.out.println();
		
		//문자열 마다 양 옆의 공백 제거
		a=a.trim();//스트링 앞 뒤의 공백문자들을 제거한 스트링 반환
		System.out.println("문자열 양 옆의 공백 제거");
		System.out.println(a);
		System.out.println();
		
		//문자열 대치
		a=a.replace("o","###");//지정한 문자(o)를 ###으로 변환하여 반환
		System.out.println("문자열에서 o를 ###로 바꿈");
		System.out.println(a);
		System.out.println();
		
		//문자열 분리
		String s[]=a.split(",");//문자열 배열 s 생성. s는 ,를 기준으로 나눠진 문자열 a를 레퍼런스로 함.
		System.out.println("문자열을 콤마로 분리");
		for(int i=0;i<s.length;i++)
			System.out.println("분리된"+i+"번 문자열: "+s[i]);
		System.out.println();
		
		//서브 스트링 a[3]~
		a=a.substring(3);//지정된 인덱스(3)부터 시작하는 서브 스트링 반환
		System.out.println("문자열의 일부 a[3]~끝");
		System.out.println(a);
		System.out.println();
		
		//문자열 속의 문자
		char c=a.charAt(2);//문자열(a) 속에 지정된 인덱스(2)에 있는 문자값 c를 반환.
		System.out.println("문자열 속의 문자 a[2]");
		System.out.println(c);
		System.out.println();
		
		//모두 소문자로 변환
		a=a.toLowerCase();
		System.out.println("소문자로 변환");
		System.out.println(a);
		System.out.println();
		
		//모두 대문자로 변환
		a=a.toUpperCase();
		System.out.println("대문자로 변환");
		System.out.println(a);
		System.out.println();
	}

}
