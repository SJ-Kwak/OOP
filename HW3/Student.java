/*hw3 컴퓨터공학전공 2076016 곽서진*/
//Student 인터페이스
public interface Student {
	void showStudentInfo();//학생 정보 출력
	void addSemester(int i, double s[]);//i학기 과목 점수 기록
	void showScore();//지금까지의 각 과목 점수와 학기 평균 출력
	void showTotAvg();//지금까지의 총 평균 반환
	int getSemester();//몇 학기생인지 반환
}
