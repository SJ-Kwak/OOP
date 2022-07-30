import java.util.Scanner;
public class ChangeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);//메인메소드 내부에 스캐너 객체 생성
		
		int money, c1, c2, c3, c4;
		System.out.println("교환할 금액을 입력: ");
		money=s.nextInt();
		
		c1=money/500;
		money=money%500;
		
		c2=money/100;//위에 500으로 나누고 남은 나머지가 여기의 money에 해당
		money=money%100;
		
		c3=money/50;
		money=money%50;
		
		c4=money/10;
		money=money%10;
		
		System.out.printf("\n 오백원==> %d개", c1);
		System.out.printf("\n 백원==> %d개", c2);
		System.out.printf("\n 오십원==> %d개", c3);
		System.out.printf("\n 십원==> %d개", c4);
		System.out.printf("\n 잔액 %d원", money);//마지막 money=money%10에서의 money에 해당
		
		s.close();
	}

}
