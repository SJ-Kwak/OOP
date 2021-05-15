import java.util.Scanner;
public class DM4_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.print("수열의 길이를 입력하세요: ");
		int num=a.nextInt();
		int s[];
		int val,n,i,j;
		
		System.out.print("숫자 "+num+"개를 입력하세요: ");
		s=new int[num];
		for(n=0;n<num;n++) {
			s[n]=a.nextInt();
		}
		
		for(i=1;i<=n+1;i++) {
			val=s[i];
			j=i-1;
			while(j>=1&&val<s[j]) {
				s[j+1]=s[j];
				j=j-1;
			}
			s[j+1]=val;
			System.out.print("순서대로 정렬: "+val);
		}
		a.close();
	}

}
