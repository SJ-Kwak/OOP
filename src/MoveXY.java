//���̺귯�� Ŭ����
public class MoveXY {
	int x,y;
	
	public MoveXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void move(int x,int y) {
		this.x+=x;
		this.y+=y;
	}
	
	void display() {
		System.out.println("(x,y)="+x+","+y);
	}
}
