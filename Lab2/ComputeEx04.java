import java.io.IOException;
import java.util.Scanner;
public class ComputeEx04 {

	public static void main(String[] args) throws IOException {//������ �߻��Ǿ ��� ����� �� �ְ� ��
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		char k; //�����ڸ� �Է¹��� ����
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���: ");
		num1=s.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���: ");
		num2=s.nextInt();
		
		System.out.print("������ �Է��ϼ���: ");
		System.out.println("+(����),-(����),*(����),/(������),%(������)");
		k=(char) System.in.read();
		
		if(k=='+') { //C����� if ���ǹ��� ���� 
			sum=num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
		}
		if(k=='-') {
			sum=num1-num2;
			System.out.println(num1+"+"+num2+"="+sum);
		}
		if(k=='*') {
			sum=num1*num2;
			System.out.println(num1+"*"+num2+"="+sum);
		}
		if(k=='/') {
			sum=num1/num2;
			System.out.println(num1+"/"+num2+"="+sum);
		}else System.out.println("0���� ������ �� �˴ϴ�!");
		
		if(k=='%') {
			sum=num1%num2;
			System.out.println(num1+"%"+num2+"="+sum);
		}else System.out.println("0���� ������ ������ ���� �� �˴ϴ�!");
		
		s.close();
	}
}
