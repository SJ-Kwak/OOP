import java.util.Scanner;
public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int i;
		
		System.out.print("문자열을 입력해 주세요!: ");
		str=s.nextLine();//한 줄 전체 입력 받음
		
		for(i=str.length()-1;i>=0;i--) {//맨 뒤부터 앞까지 출력. str.length 메소드: 문자열 길이 반환
			System.out.printf("%c",str.charAt(i));//str.charAt(i): 문자열의 위치와 한 글자 반환. i: 문자열 위치
		}
		System.out.println();
		s.close();
	}

}
