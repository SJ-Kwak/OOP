import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();//랜덤 객체 생성
		Scanner stdIn = new Scanner(System.in);//스캐너 객체 생성
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();//요소 수 입력
		int[] a = new int[n];//배열 선언
		
		for(int i=0;i<n;i++) {
			a[i]=10+rand.nextInt(90);//0이상 90미만의 난수 발생+10을 더해 1~100까지의 난수 설정
			//배열 원소에 사용자 입력 데이터만큼의 정수를 랜덤하게 발생시킴
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		for(int i=0;i<n/2;i++) {//역순으로 바꾸기. n/2만큼만 반복
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
		System.out.println("요소를 역순으로 춮력");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		stdIn.close();

	}

}
