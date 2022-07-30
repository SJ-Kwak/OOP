import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료!");
		
		while(true) {//조건식이 참이면 계속 실행
			System.out.print(">>데이터 입력 => ");
			String text = s.nextLine();//빈 문자열 포함하는 한 줄 전체 입력 시 사용
			if(text.equals("exit"))//문자열 비교. string변수 선언한 변수값과 exit를 비교하기 위해 text.equlas 사용
				break;
		}
		System.out.println("종료합니다!");
		s.close();
	}

}
