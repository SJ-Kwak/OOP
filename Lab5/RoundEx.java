//실행 클래스
public class RoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Round[] c; //Round 배열에 대한 레퍼런스 c 선언
		c = new Round[5]; //5개의 레퍼런스 배열 생성. 배열의 원소: 객체 x. 클래스 객체에 대한 레퍼런스
		
		for(int i=0;i<c.length;i++)
			c[i]=new Round(i);//클래스 객체 하나씩 생성하여 배열의 각 레퍼런스에 대입.
		//클래스 객체 배열 생성
		
		for(int i=0;i<c.length;i++)
			System.out.print((int)c[i].getArea()+" ");//모든 레퍼런스 배열의 면적 출력
	}

}
