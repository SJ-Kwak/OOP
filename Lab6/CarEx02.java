//���� Ŭ����
import java.util.Scanner;
public class CarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("�ڵ��� ������ �Է�!");
		 System.out.print("�̸�: "); String name =s.next();
		 System.out.print("�ʺ�: "); int width=s.nextInt();
		 System.out.print("����: "); int height=s.nextInt();
		 System.out.print("����: "); int length=s.nextInt();
		 System.out.print("���ᷮ: "); double fuel=s.nextDouble();
		 
		 Car myCar = new Car(name, width, height, length, fuel);//�Էµ� ������ ��ü ����. ��ǥ 0,0
		 
		 while(true) {
			 System.out.println("���� ��ġ("+myCar.getX()+","+myCar.getY()+"), ���� ����: "+myCar.getFuel());
			 System.out.print("�̵�? [0:No, 1:Yes]");
			 if(s.nextInt()==0) break;
			 
			 System.out.print("x������ �̵��Ÿ�: ");
			 double dx=s.nextDouble();
			 System.out.print("y������ �̵��Ÿ�: ");
			 double dy=s.nextDouble();
			 
			 if(!myCar.move(dx,dy))
				 System.out.println("���� ����!");
		 }
		 s.close();
	}
}
