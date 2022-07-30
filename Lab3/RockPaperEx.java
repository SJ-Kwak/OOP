import java.util.Scanner;//스캐너 클래스 경로 설정
public class RockPaperEx {
	//상수 선언. 변수 앞에 final 키워드 붙이면 상수로 설정.
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)를 선택하세요: ");
		int user = s.nextInt();
		int computer = (int)(Math.random()*3);//computer가 생성한 난수값 저장
		//Math.random 메소드: math 클래스 소속. java 최상위 클래스 object 내에 위치. 따로 import문 필요x. 
		//일반적으로 0이상 1미만의 부동 소수점 생성 메소드. => 0.0과 같거나 크고 1.0보다 작은 값 생성.
		//Math.random()*3: 세가지 값을 생성 위해 3을 곱함. 0,1,2 3가지 값 중 랜덤으로 난수 생성. n가지 랜덤 생성하려면 n을 곱하면 됨. 
		//부동 소수점으로 나오는 실수값을 캐스팅 연산자 사용하여 (int)를 앞에 붙여주면서 정수값으로 바꿔줌.
		
		if(user==0)System.out.print("가위");//다중 if-else문
		else if(user==1)System.out.print("바위");
		else System.out.print("보");
		
		if(computer==0)System.out.print(": 가위 ");
		else if(computer==1)System.out.print(": 바위 ");
		else System.out.print(": 보 ");
		
		if(user==computer)
			System.out.println("비겼네요!");
		else if(user==(computer+1)%3)//0은 1에게 지고, 1은 2에게 지고, 2는 0에게 진다.
			System.out.println("이겼네요!");
		else
			System.out.println("안타깝게 지셨군요!");
		s.close();
	}

}
