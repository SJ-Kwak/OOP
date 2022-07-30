import java.util.Scanner;//스캐너 클래스 경로 설정
public class SeasonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("월(1~12)입력: ");
		
		int month = a.nextInt();
		switch(month) { // 먼저 식 계산 후, 결과값과 일치하는 case문으로 분기
		case 3: case 4: case 5:
			System.out.println("Spring!");//실행 문장 중괄호로 둘러싸지 않음
			break;//switch문 벗어남
		case 6: case 7: case 8:
			System.out.println("Summer!");
			break;
		case 9:case 10: case 11:
			System.out.println("Autumn!");
			break;
		case 12: case 1: case 2:
			System.out.println("Winter!");
			break;
		default: System.out.println("잘못된 월을 입력하셨습니다!");//어떤 case문으로도 분기하지 못할 경우. default 생략 가능
		
		a.close();
		}
	}

}
