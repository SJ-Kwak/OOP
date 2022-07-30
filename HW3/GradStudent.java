//인터페이스 구현 클래스
public class GradStudent implements Student {
	String name;//이름 저장 변수
	double[][]score=new double[4][3];//이차원 배열. 행: 학기, 열: 과목
	double scoreavg[]=new double[4];//학기평균 저장 배열.
	int semester;//학기수 저장 변수
	double avgtotal=0;//총평균 저장 변수
	
	public GradStudent(String name) {//name을 매개변수로 하는 생성자
		this.name=name;
	}
	
	@Override
	public void showStudentInfo() {//학생 정보 출력 메소드
		System.out.println("===================================================");
		System.out.println("대학원 "+semester+"학기 "+name);

	}

	@Override
	public void addSemester(int i, double[] s) {//학기별 과목 점수 기록 메소드
		semester=i;//학기 저장
		double scoresum=0.0;//점수 합산 변수 선언 및 초기화
		for(int j=0;j<3;j++) {//3과목 점수 합산
			score[semester][j]=s[j];//이차원 배열의 '열'에 메인클래스에서 받은 과목 점수 저장
			scoresum+=score[semester][j];//과목 점수 합산
		}
		scoreavg[semester-1]=scoresum/3;//학기별 과목 점수 평균 저장. semester는 학기 변수라 1부터 시작하기 때문에 배열에의 사용을 위해 semester-1을 해준다.
		avgtotal+=scoreavg[semester-1];//학기별 평균을 합산하여 총평균에 저장.
	}

	@Override
	public void showScore() {//학기별 점수, 평균 출력 메소드
		for(int m=1;m<=semester;m++) {//학기 출력
			System.out.print(m+"학기: ");
			for(int n=0;n<3;n++) {//학기별 과목 점수 출력
				System.out.print(score[m][n]+" ");
			}
			System.out.printf("학기 평균= %.2f \n",scoreavg[m-1]);//학기 평균 소수 둘째자리까지 출력.
		}

	}

	@Override
	public void showTotAvg() {//총평균 출력 메소드
		System.out.printf("총평균= %.2f \n",avgtotal/semester);
		//addSemester 메소드에서 구한 avgtotal을 학기 수로 나누기. 소수 둘째자리까지 출력
	}

	@Override
	public int getSemester() {//학기수 리턴
		return semester;
	}

}
