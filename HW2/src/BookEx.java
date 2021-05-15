//실행 클래스
import java.util.InputMismatchException;
import java.util.Scanner;
class BookEx {//접근지정자 default

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookManagement books = new BookManagement();//books 객체 생성
		BookManagement info = new BookManagement("곽서진","2021.05.09");//User클래스 활용하여 info 객체 생성. 생성자를 이용하여 초기화.
		int num = 0;//선택 변호 변수
		boolean run=true;//boolean 변수
		
		info.showUser();
		while(run) {//run이 false가 되기 전까지 무한루프
			System.out.println("====================================");
			System.out.println("1. 도서 등록 | 2. 도서 목록 출력 | 3. 종료");
			System.out.println("====================================");
			System.out.print("번호를 선택하세요: ");
			try {
				num=s.nextInt();//선택 번호 입력
			}
			catch(InputMismatchException e) {//정수가 아닌 문자 입력 시 예외 처리
				System.out.println("1~3까지의 정수를 입력하세요!");
				s.nextLine();
				continue;//다시 번호 입력
			}
			switch(num) {//switch문 사용
				case 1:
					books.registerBook();//도서 등록. BookManagement클래스의 registerBook메소드 호출.
					break;
				case 2:
					books.printBook();//도서 목록 출력. printBook메소드 호출
					break;
				case 3:
					System.out.println("프로그램 종료");
					run=false;//while문의 조건식인 run이 false가 되면 while문 break
					break;
				default:System.out.println("1에서 3 사이의 정수를 입력하세요!");
						
			}
		}
		s.close();
	}
}
