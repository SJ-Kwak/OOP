//2차원 배열에 학년별로 1,2학기 성적을 저장하고, 4년간 전체 평점 평균을 출력하는 프로그램을 작성하시오.
public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.5,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum=0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term];
		
		System.out.printf("평점 평균: %.2f", sum/(score.length*score[0].length));
		//score.length 배열의 행 개수, score[0].length 배열의 0번째 행의 열 개수. 정방형 배열이기 때문에 아무 행이나 설정 가능
				

	}

}
