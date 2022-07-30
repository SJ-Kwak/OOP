//라이브러리 클래스
public class Round {
	int radius;
	
	public Round(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
		//return 3.14*this.radius*this.radius로 작성해도 무방
	}

}
