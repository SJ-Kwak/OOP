import java.util.Scanner;
public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요: ");
		
		int sum=0;
		
		for(int i=0;i<5;i++){
			int n=s.nextInt();//정수 입력
			
			if(n<=0)
				continue;//n이 양수가 아닐 시, 다시 int n=s.nextInt()문으로 goback. 
			else
				sum+=n;//양수인 경우 합산
		}
		System.out.println("양수의 sum: "+sum);
		s.close();

	}

}
