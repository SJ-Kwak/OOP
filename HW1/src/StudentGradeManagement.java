/*hw1 2076016 곽서진*/

import java.util.InputMismatchException; //exception file import
import java.util.Scanner; //scanner 객체 생성
public class StudentGradeManagement {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //스캐너 객체를 통해 입력값 받음
		int num=0;//학생 수 변수 선언 및 초기화
		int sel=0;//1~5까지의 선택 변수 선언
		int score[]=null; //점수 배열 선언 및 null값으로 초기화
		int i;//index변수 i 선언
		
			do {//do~while 문을 통해 출력문 반복되게 함.
				try {//try~catch문으로 선택 변수 순서대로 입력받게 함.
					System.out.println("--------------------------------------------------------------");
					System.out.println(">>1. 학생수 입력 >>2. 점수 입력 >>3. 점수 리스트 >>4. 점수 분석 >.5. 종료");
					System.out.println("--------------------------------------------------------------");
					System.out.print("선택>");
					try {//try ~ catch문을 통해 예외 처리
						sel=s.nextInt();//스캐너 객체를 통해 선택 변수 입력.
					}
					catch(InputMismatchException e) {//정수가 아닌 데이터 입력 시, 예외 처리
						System.out.println("정수가 아닙니다. 1부터 5까지의 정수를 순서대로 선택해주세요.");
						s.nextLine();//현재 입력스트림에 남아있는 토큰을 지움. 문자 입력 시, 예외 발생이니까 잘못 입력된 문자열을 지우기.
						continue;//다시 선택 변수 입력 받으러 가기
					}
					switch(sel) {//선택 변수 sel에 대한 switch문
					case 1://sel값이 1일 경우
						System.out.print("학생수를 입력해 주세요!> ");
						try {
							num=s.nextInt();//스캐너 객체를 통해 학생 수 입력
							if(num==0) {
								System.out.println("0이 아닌 정수를 입력해주세요.");//만약 정수 0 입력 시, 재입력받기
								s.nextLine();
								System.out.print("학생수를 입력해 주세요!> ");//문자 입력 시, 학생 수 다시 입력 받음
								num=s.nextInt();
							}
						}
						catch(InputMismatchException e) {//정수가 아닌 데이터 입력 시, 예외 처리
							System.out.println("정수가 아닙니다.");
							s.nextLine();
							System.out.print("학생수를 입력해 주세요!> ");//문자 입력 시, 학생 수 다시 입력 받음
							num=s.nextInt();
						}												
						score=new int[num];//정수형 score 배열 생성
						break;
					case 2://sel값이 2일 경우
						for(i=0;i<score.length;i++) {//i가 score배열의 길이보다 작을 때
							try {
								System.out.println("점수를 입력해 주세요!> ");
								System.out.print(i+1+"번 학생> ");//i를 0부터 시작했기 때문에 i+1번째 학생으로 표시
								score[i]=s.nextInt();//배열의 각 원소에 입력값 저장.
								if(score[i]>100 || score[i]<0) {//입력된 점수값이 0과 100사이에 없을 시
									System.out.println("0부터 100 안에서만 입력하세요");
									s.nextLine();//문자열 입력받은 거 지우기
									i--;//인덱스 i값이 증가하지 않도록 미리 감소
								}
							}
							catch(InputMismatchException e) {
								System.out.println("정수가 아닙니다.");//정수가 아닌 데이터 입력 시, 예외 처리
								s.nextLine();//문자열 입력받은 거 지우기
								i--;//i값 증가하지 않도록 미리 감소
								continue;//다시 for문으로 분기. 점수 입력 받으러 가기.
							}
						}
						break;
					case 3://sel값이 3일 경우
						for(i=0;i<score.length;i++) {//배열의 0번째 원소부터 차례대로
							System.out.println(i+1+"번 학생: "+score[i]+"점");//i+1번째 학생의 점수 출력.
							for(int j=0;j<score[i];j++)//배열의 0번째 원소부터 차례대로. j값이 배열 각각의 원소값보다 작을 때
								System.out.print("*");//배열의 각 원소값만큼 *출력
							System.out.println();//출력 후 줄바꿈
						}
						break;
					case 4:
						int max=score[0];//배열 0번째 원소값으로 초기화
						double sum=0.0;//실수형 변수 선언 및 초기화
						for(i=0;i<score.length;i++) {
							if(score[i]>max)//배열의 원소값이 max보다 클 때. 이때 처음 저장되어있는 max는 배열의 0번째 원소값
								max=score[i];//최대값 구하기
							sum+=score[i];//배열 원소의 합 구하기
						}
						System.out.println("최고 점수: "+max);
						System.out.printf("평균 점수: %.2f", sum/score.length);//소수 둘째자리까지 출력. 배열 원소의 합/배열의 길이=>평균
						System.out.println();
						
						for(i=0;i<score.length;i++) {
							char grade;//점수에 따른 성적을 저장할 문자형 변수 grade 선언
							grade=(score[i]>=90)?'A':((score[i]>=80)?'B':((score[i]>=70)?'C':(score[i]>=60)?'D':'F'));
							//조건 연산자 이용하여 점수에 따른 학점 부여
							System.out.println(i+1+"번 학생: "+score[i]+" "+grade+"학점");
						}
						break;
					case 5:
						System.out.println("프로그램 종료합니다! 다음에 또 이용해주세요! Good Bye!!");
						break;
					default://1~5가 아닌 다른 값 입력 시, 재입력받음
						System.out.println("1~5 사이의 정수에서 선택하세요.");
						continue;
					}
				}
				catch(NullPointerException e) {//1부터 5까지 순서대로 선택하지 않으면 score배열의 null 레퍼런스를 참조한 채로 작업 진행. 예외 처리
					System.out.println("1부터 5까지 순서대로 선택하세요.");//순서대로 입력하게 함
					continue;//다시 선택 변수 입력받으러 돌아감
				}
			}while(sel!=5);//작업문 실행 후 sel값이 5가 아닐 경우, 즉 선택 5까지 전부 실행한 경우, 반복문 종료 
		s.close();//스캐너 객체 닫음
	}
}
