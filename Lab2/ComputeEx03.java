import java.util.Scanner;
public class ComputeEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum, k;
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���: ");
		
		num1=s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���: ");
		
		num2=s.nextInt();
		System.out.print("������ �����ϼ���: ");
		System.out.println("1:����(+), 2:����(-), 3:����(*), 4:������(/)");
		
		k=s.nextInt();
		
		if(k==1) {
			sum=num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
		}
		
		if(k==2) {
			sum=num1-num2;
			System.out.println(num1+"-"+num2+"="+sum);
		}
		
		if(k==3) {
			sum=num1*num2;
			System.out.println(num1+"*"+num2+"="+sum);
		}
		
		if(k==4) {
			sum=num1/num2;
			System.out.println(num1+"/"+num2+"="+sum);
		}
		s.close();						
	}

}
