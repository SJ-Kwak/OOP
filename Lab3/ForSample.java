
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//합산변수. 초기값 0으로 설정. 누적연산시 계산 오류 줄이기 위해.
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
