//라이브러리 클래스 BookManagement
import java.util.InputMismatchException;
import java.util.Scanner;

class BookManagement {//클래스 접근지정자 default
	Scanner s = new Scanner(System.in);//입력값 받을 스캐너 객체 생성
	Book[] books = new Book[100];//Book 클래스 활용하여 books 객체 배열 생성. 도서목록 저장 예정.
	//필드 선언
	int num=1;//도서 번호 변수
	int select=0;//도서 목록 출력 방식 선택 변수
	int selectNum=0;//특정 도서 출력 선택 변수
	String name;//등록인
	String date;//등록일자
	boolean run=true;//boolean 변수
	
	public BookManagement() {}//기본 생성자
	
	public BookManagement(String name, String date) {//도서 등록인과 등록일자 저장하는 생성자. 매개변수 2개
		this.name=name;
		this.date=date;
	}
	
	public void showUser() {//등록인, 등록일자 출력 메소드.
		System.out.println("등록인: "+name+" | 등록일자: "+date);
	}
	
	public void registerBook() {//도서 등록 메소드
		System.out.println("1. 도서 등록");
		System.out.print("등록할 도서의 제목을 입력하세요: ");
		String title = s.nextLine();//제목 입력
		System.out.print("등록할 도서의 저자를 입력하세요: ");
		String author = s.nextLine();//저자 입력
		
		Book b = new Book();//b 객체 생성
		//Book클래스에서 private으로 정의된 메소드를 BookManagement에서 활용하기 위해 setter메소드 호출.
		b.setNum(num);
		b.setTitle(title);
		b.setAuthor(author);
		books[num++]=b;//후위 증감 연산자 사용으로 인덱스 설정.
	}
	
	public void printBook() {//도서 목록 출력 메소드
		System.out.println("2. 도서 목록 출력");
		System.out.print("(1) 전체 도서 목록 출력 | (2) 특정 도서 출력 >>");
		try {
			select=s.nextInt();
		}catch(InputMismatchException e) {//정수가 아닌 문자 입력 시, 예외 발생
			System.out.println("숫자 1 또는 2를 입력하세요!");
			s.nextLine();//토큰 삭제
			System.out.print("(1) 전체 도서 목록 출력 | (2) 특정 도서 출력 >>");
			select=s.nextInt();//재입력
		}
		switch(select) {//2가지 선택지.
		case 1://전체 도서 목록 출력
			for(int i=1;i<num;i++) {//1번부터 현재 등록된 도서까지 전부 출력
				books[i].show();//Book클래스의 show메소드 호출
			}
			break;
		case 2://특정 도서 출력
			while(true) {//예외 발생 시, 재실행 원활하게 하기 위해 while 반복문 사용
				System.out.print("출력을 원하는 도서의 번호를 입력하세요: ");
				try {
					selectNum=s.nextInt();//특정 도서 번호 입력
				}catch(NullPointerException e) {//현재 등록된 도서 수보다 큰 번호를 입력 시 예외 처리
					System.out.println("현재 입력된 도서 목록 내의 번호를 입력하세요");
					s.nextLine();
					System.out.print("출력을 원하는 도서의 번호를 입력하세요: ");
					try {selectNum=s.nextInt();
					}catch(InputMismatchException a) {//정수 아닌 문자 입력 시 예외 처리
						System.out.println("자연수를 입력하세요!");
						s.nextLine();
						continue;
					}
				}catch(InputMismatchException e) {//정수 아닌 문자 입력 시 예외 처리
					System.out.println("자연수를 입력하세요!");
					s.nextLine();
					System.out.print("출력을 원하는 도서의 번호를 입력하세요: ");
					try{selectNum=s.nextInt();
					}catch(NullPointerException a) {//현재 등록된 도서 수보다 큰 번호를 입력 시 예외 처리
						System.out.println("현재 입력된 도서 목록 내의 번호를 입력하세요");
						s.nextLine();
						continue;
					}
				}
				try {
					books[selectNum].show(selectNum);//특정 도서 출력. 매개변수를 가지는 show메소드 출력
				}catch(NullPointerException e) {//현재 저장된 도서 권수보다 큰 번호 선택 시, null 레퍼런스 참조하게 됨. 예외 발생
					System.out.println("현재 입력된 도서 목록 내의 번호를 입력하세요");
					s.nextLine();
					continue;	
				}
				break;
			}
			break;//while문 탈출.
		default: 
			System.out.println("숫자 1 또는 2를 입력하세요!");	//1,2번 이외의 번호 입력 시 제대로 시행될 수 없음.	
			printBook();//이 메소드 재실행.
		}
		
	}
}
