import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���: ");
		int dec,bin=0;
		dec=s.nextInt();
		
		System.out.println("������: ");
		while(true) {
			dec/=2;
			bin%=2;
			System.out.print(bin);
			break;
		}
	}

}
