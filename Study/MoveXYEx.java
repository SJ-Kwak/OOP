//���� Ŭ����
import java.util.Scanner;
public class MoveXYEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int x,y;
		
		MoveXY coordinate= new MoveXY(0,0);
		coordinate.display();
		
		System.out.println("�� ���� ������ �Է��ϼ���: ");
		x=s.nextInt();
		y=s.nextInt();
		
		coordinate.move(x,y);
		coordinate.display();
		
		s.close();
	}

}
