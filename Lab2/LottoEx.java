import java.util.Random;//class보다 먼저 생성.
public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int lucky=rand.nextInt(10);//0~9의 난수. 0이상 9이하의 값 중 하나의 값으로 초기화됨
		System.out.println("오늘의 행운의 번호는"+lucky+"입니다!");
	}
}
