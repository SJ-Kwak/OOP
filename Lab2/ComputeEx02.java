import java.util.Scanner;//스캐너 클래스 경로 설정
public class ComputeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		result=num1+num2;
		//sout 타이핑 후 ctrl+space 단축키 사용
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
