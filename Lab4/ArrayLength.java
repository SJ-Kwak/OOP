//배열의 length 필드를 이용하여 배열 크기만큼 정수 입력. 평균 구하기
import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Array[]=new int[4];//배열 선언 및 생성
		int sum=0;
		
		System.out.println(Array.length+"개의 정수 입력하세요: ");
		for(int i=0;i<Array.length;i++)
			Array[i]=s.nextInt();//입력 정수 배열에 순차적으로 저장
		
		for(int i=0;i<Array.length;i++)
			sum+=Array[i];//배열에 저장된 정수값 합산
		
		System.out.println("평균은 "+sum/Array.length+"입니다.");
		s.close();

	}

}
