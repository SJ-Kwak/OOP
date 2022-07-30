import java.util.Scanner;//스캐너 클래스 경로 설정
public class JuminEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte num = -1; //byte형 변수. 주민번호: 음수값x. 음수값 -1로 초기화 진행
		short year = 0; //출생연도 저장
		String gender = "";//성별 저장. Null값으로 초기화
		System.out.println("주민번호의 7번째 자리를 입력: ");
		num=s.nextByte();//입력받을 숫자가 크지 않을 경우 byte형 변수를 사용하여 메모리 적게 사용하는 것이 좋음
		
		//연도 판별
		switch(num){
			case 9:
			case 0:
				year = 1800;
				break;
			case 1:
			case 2:
				year = 1900;
				break;
			case 3:
			case 4:
				year = 2000;
				break;
			default: year = -1;//case들에 해당되지 않는 경우
		}
		
		//성별 판별
		if(year!=-1) {
			gender = num %2 == 0 ? "여성":"남성";//삼항연산자: 조건연산자 활용하여 조건문. 끝자리 짝수면 여성, 홀수면 남성
		}
		System.out.println(year+"년대"+gender+"분입니다!");
		
		s.close();

	}

}
