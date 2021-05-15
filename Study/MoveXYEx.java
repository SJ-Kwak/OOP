//실행 클래스
import java.util.Scanner;
public class MoveXYEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int x,y;
		
		MoveXY coordinate= new MoveXY(0,0);
		coordinate.display();
		
		System.out.println("두 개의 정수를 입력하세요: ");
		x=s.nextInt();
		y=s.nextInt();
		
		coordinate.move(x,y);
		coordinate.display();
		
		s.close();
	}

}
