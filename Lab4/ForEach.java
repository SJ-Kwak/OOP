
public class ForEach {
	enum Week {월, 화, 수, 목, 금, 토, 일}//열거형 enum Week에 열거상수 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};//정수형 배열
		int sum=0;
		String names[]= {"딸기", "체리", "바나나", "포도"};//문자열
		
		for(int k:n) {//n.length만큼 반복
			System.out.print(k+" ");//반복되는 k값 출력
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		for(String s:names) {//names.length만큼 반복
			System.out.print(s+" ");//순서대로 출력
		}
		System.out.println();
		
		for(Week day: Week.values())//열거형 enum에 정의된 상수들 출력
			System.out.print(day+"요일 ");
			System.out.println();
	}

}
