import java.util.Scanner;
public class InfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 도시 나이 체중 미혼 여부를 빈칸으로 분리하여 입력하세요!");
		Scanner in = new Scanner(System.in);//스캐너 객체 생성
		
		String name = in.next(); //문자열 토큰 읽기 (한 줄 전체를 읽기 원하면 nextline 메소드 사용)
		System.out.println("이름: "+name);
		
		String city = in.next(); //문자열 토큰 읽기
		System.out.println("도시: "+city);
		
		int age = in.nextInt(); //정수 토큰 읽기
		System.out.println("나이: "+age);
		
		double weight = in.nextDouble(); //실수 토큰 읽기
		System.out.println("체중: "+weight);
		
		boolean single = in.nextBoolean(); //boolean 토큰 읽기 (true false로 입력)
		System.out.println("미혼 여부: "+single);
		
		in.close();//스캐너 객체 닫기
	}

}
