import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int year;
		
		System.out.println("���� �Է�: ");
		year=s.nextInt();
		
		if(((year%4 == 0)&&(year%100 !=0))||(year%400 ==0))//���̸� ���� �����̸� ���
			System.out.printf("%d���� ����!\n", year);
		else
			System.out.printf("%d���� ���!\n", year);
		
		s.close();

	}

}
