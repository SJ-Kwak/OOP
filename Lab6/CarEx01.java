//실행 클래스
public class CarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car("소나타", 1660, 1500, 3640, 40.0);//sonata 객체 생성. car 클래스에서 변수 참조.
		Car grandeur = new Car("그랜저", 1660, 1525, 3695, 41.0);//객체 필드에 접근하여 데이터 변경. 필드 사용: 필드값 읽고 변경.
		
		sonata.show();
		System.out.println();
		grandeur.show();
	}
}
