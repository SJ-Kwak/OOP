import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0; // 입력 정수 개수 카운트
		int sum=0; // 입력 정수 합산
		
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력: ");
		
		int n=s.nextInt();
		
		//-1 입력 시, while문 break
		while(n!=-1) {
			sum+=n;
			count++;
			n=s.nextInt();
		}
		
		if(count==0)
			System.out.println("입력된 정수가 없습니다");
		else {
			System.out.print("정수의 개수는 "+count+"개이며");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		s.close();

	}

}
