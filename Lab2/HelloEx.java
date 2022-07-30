import java.util.Scanner;//스캐너 클래스 경로 설정
public class HelloEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//스캐너 객체 생성
		//new 연산자: 객체 생성. System.in: 키보드로부터 받은 바이트 정리
		//스캐너: 이것들을 분리하여, 정수, 실수, 문자열 형태로 만듦
		System.out.print("이름을 입력하세요: ");
		String name = in.nextLine();//스캐너 클래스 메소드: 넥스트라인 메소드. 데이터 입력 시, 한 줄 전체를 읽어들임.
		System.out.println("안녕하세요! "+name+"님 만나서 반갑습니다!");
		in.close();//스캐너 클래스 사용이 끝나면 사용 종료. system.in도 함께 닫힘.
		//이 코드가 없으면 warning 그러나 실행하는 데에는 큰 문제 없음. 자동으로 닫힘.
		//스캐너 객체 하나만 생성하고 공유하는 것이 바람직. 모두 하나뿐인 system.in 공유.
	}

}
