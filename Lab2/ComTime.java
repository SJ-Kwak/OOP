
public class ComTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4; //변수값 더이상 변화x. 상수
		double distance = 40e12; //지수 표기법을 사용한 실수형 리터럴. e=10
		
		double time;
		
		time=distance/light_speed;
		
		double light_year = time / (60.0*60.0*24.0*365.0); //광년: 빛이 1년에 진행하는 거리
		System.out.println("걸리는 시간은 "+light_year+"광년!");
	}

}
