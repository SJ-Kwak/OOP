//슈퍼클래스
public class Point {
	int x,y;//한 점 구성하는 x,y 좌표
	
	public Point() {//기본 생성자
		this.x=this.y=0;
	}
	//기본 생성자 생성 후에 매개변수 가진 생성자 작성하기.
	
	public Point(int x,int y) {//매개변수 2개 생성자
		this.x=x;
		this.y=y;
	}
	
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void showPoint() {//점 좌표 출력
		System.out.println("("+x+","+y+")");
	}

}
