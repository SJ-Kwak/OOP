import java.util.Scanner;//��ĳ�� Ŭ���� ��� ����
public class ComputeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		result=num1+num2;
		//sout Ÿ���� �� ctrl+space ����Ű ���
		System.out.println(num1+"+"+num2+"="+result);
		
		result=num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		result=num1*num2;
		System.out.println(num1+"*"+num2+"="+result);
		
		result=num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
		s.close();	
	}

}
