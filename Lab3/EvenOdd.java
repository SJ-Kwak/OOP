import java.util.Scanner;//스캐너 경로 설정
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;//변수 선언
		Scanner s = new Scanner(System.in);//스캐너 클래스 객체 생성
		System.out.println("정수입력: ");//출력문을 이용하여 입력메세지 작성
		num=s.nextInt();//정수 입력을 읽어들임
		
		if(num%2==0) {
			System.out.println("짝수!!");
		}
		else {
			System.out.println("홀수!!");
		}
		s.close();
	}

}
