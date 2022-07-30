//main()에서 명령행 인자합 출력
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		for(int i=0;i<args.length;i++)//인자개수만큼 반복
			sum+=Double.parseDouble(args[i]);//args는 string type이니까 double 실수 type으로 변환.
			System.out.println("합계: "+sum);
			//run configuration으로 실행.

	}

}
