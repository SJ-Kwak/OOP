/*hw1 2076016 곽서진*/

import java.util.InputMismatchException;//exception file import
import java.util.Scanner;//스캐너 객체 생성
public class RockScissorPaper {
	
	//상수 선언. 변수 앞에 final 키워드 붙이면 상수로 설정.
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 0;//게임을 계속 실행할지 말지를 결정하는 선택 변수 선언 및 초기화
		int user = 0;//사용자 입력값 변수 선언 및 초기화
		
		while(true) {//가위바위보 게임이 계속 실행되도록 함.
			int computer = (int)(Math.random()*3);//computer가 생성한 난수값 저장
			//일반적으로 0이상 1미만의 부동 소수점 생성 메소드. => 0.0과 같거나 크고 1.0보다 작은 값 생성.
			//세가지 값 생성 위해 3을 곱함. 0,1,2 3가지 값 중 랜덤으로 난수 생성.
			//실수값을 캐스팅 연산자를 통해 정수형으로 강제적 형 변환.
			
			while(true) {//가위바위보 게임 진행 반복
				try {//입력값 예외 처리
					System.out.print("가위(0), 바위(1), 보(2)를 선택하세요: ");
					user = s.nextInt();
				}
				catch(InputMismatchException e) {//문자 입력 시 예외처리
					System.out.println("숫자를 입력해주세요.");
					s.nextLine();//현재 입력스트림에 남아있는 토큰을 지움. 문자 입력 시, 예외 발생이니까 잘못 입력된 문자열을 지우기.
					continue;//다시 입력받으러 가기
				}
				
				switch(user) {//if문을 switch문으로 변경. 사용자 패 표기
				case 0: 
					System.out.print("가위");
					break;
				case 1: 
					System.out.print("바위");
					break;
				case 2: 
					System.out.print("보");
					break;
				}
				
				switch(computer) {//if문을 switch문으로 변경. 컴퓨터 패 표기
				case 0: 
					System.out.print(": 가위 ");
					break;
				case 1: 
					System.out.print(": 바위 ");
					break;
				case 2: 
					System.out.print(": 보 ");
					break;
				}
				
				if(user==computer)//가위바위보 승패 판정
					System.out.println("비겼네요!");
				else if(user==(computer+1)%3)//0은 1에게 지고, 1은 2에게 지고, 2는 0에게 진다.
					System.out.println("이겼네요!");
				else
					System.out.println("안타깝게 지셨군요!");
				
				break;//가위바위보 게임 실행 반복문 끝내기
			}
			
			while(true) {//가위바위보 게임 재시작 여부 선택
				try {
					System.out.print("게임을 계속하시겠다면 숫자 1을, 종료하시겠다면 숫자 2를 눌러주세요: ");
					choice = s.nextInt();//스캐너 객체를 통해 선택값 입력
				}
				catch(InputMismatchException e) {//문자 입력 시, 예외처리
					System.out.println("숫자를 입력해주세요.");
					s.nextLine();
					continue;//다시 재시작 여부 choice변수 입력값 받기
				}
				break;//가위바위보 게임 재시작 여부 반복문 끝내기				
			}
			
			if(choice==1)//재시작을 원하면
				continue;//다시 컴퓨터 난수 생성으로 돌아감
			else if(choice==2) //재시작을 원하지 않으면
				break;//가위바위보 게임 실행 종료. 반복문 끝내기
			
		}
		System.out.println("가위바위보 게임 종료");
		s.close();//스캐너 객체 닫음
	}
}
