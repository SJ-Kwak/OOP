import java.util.Scanner;
public class ReturnArray {//배열 리턴 메소드
	static int[] iArray(int n) {
		int[] a = new int[n];//배열 생성
		for(int i=0;i<n;i++)//배열 초기값 지정, 배열 원소값 지정
			a[i]=i;
		return a;//배열 a 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("요소(원소) 수 입력: ");
		int n=s.nextInt();
		int[] x=iArray(n);//배열 x 선언 후, iArray 메소드 호출.
		
		for(int i=0;i<n;i++)
			System.out.println("x["+i+"]="+x[i]);
		s.close();		
		
	}

}
