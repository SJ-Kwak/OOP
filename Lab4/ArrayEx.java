//사용자로부터 5개의 숫자를 입력받아 배열에 저장. 제일 큰 수와 합계 출력
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Array[]=new int[5];//배열 선언 및 생성. 배열 크기 5.
		int max=0, sum=0;//큰 수, 합계 변수 선언 및 초기화
		
		System.out.println("5개의 숫자를 입력하세요: ");
		for(int i=0;i<5;i++) {
			Array[i]=s.nextInt();//배열의 원소에 순차적으로 입력된 정수값 저장
		}
		
		for(int i=0;i<5;i++) {
			sum+=Array[i];//배열의 원소값 합산
			if(max<Array[i])//Array[i]가 현재 가장 큰 수보다 크면
				max=Array[i];//max에 Array[i]값 저장
		}
		System.out.println("제일 큰 수: "+max);
		System.out.println("합계: "+sum);
		
		s.close();
		
	}

}
