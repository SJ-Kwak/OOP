import java.io.IOException;
import java.util.Scanner;
public class ComputeEx04 {

	public static void main(String[] args) throws IOException {//오류가 발생되어도 계속 실행될 수 있게 함
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		char k; //연산자를 입력받을 변수
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요: ");
		num1=s.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		num2=s.nextInt();
		
		System.out.print("연산을 입력하세요: ");
		System.out.println("+(덧셈),-(뺄셈),*(곱셈),/(나눗셈),%(나머지)");
		k=(char) System.in.read();
		
		if(k=='+') { //C언어의 if 조건문과 동일 
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
		}else System.out.println("0으로 나누면 안 됩니다!");
		
		if(k=='%') {
			sum=num1%num2;
			System.out.println(num1+"%"+num2+"="+sum);
		}else System.out.println("0으로 나누면 나머지 값이 안 됩니다!");
		
		s.close();
	}
}
