import java.util.Scanner;//스캐너 클래스 경로 설정
public class CoffeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("무슨 커피를 주문하시겠습니까?");
		String order = s.next();//문자열 입력받음. next메소드: 빈 문자열 리턴x. => 데이터 입력 시, 빈칸 입력 x
		
		int price = 0;
		
		switch(order) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" :
			price = 3500; break;
			
		case "아메리카노" :
			price = 2000; break;
			
		default: System.out.println("메뉴에 없습니다!");			
		}
		
		if(price!=0) System.out.println(order+"는 "+price+"원입니다!");
		s.close();
	}

}
