//라이브러리 클래스
public class Rectangle {
	private double width, height, area; //밑변, 높이, 면적
	//private: 모든 외부 클래스에서 접근 불가
	public Rectangle(double w, double h) {//생성자
		width=w;
		height=h;
	}
	
	public double ComputeArea() {
		area=width*height;
		return area;
	}
	public double ShowWidth() {
		return width;
	}
	public double ShowHeight() {
		return height;
	}

	/*Getter 메소드 사용방법
	 * public 필드타입 get + 필드이름(){
	 * 		return 필드값:
	 * }
	 * 접근제한자: public 선언
	 * 리턴 타입: 필드 타입
	 * 메소드 이름: get+필드이름(첫글자는 대문자)
	 * 리턴값: 필드값
	 */
	public double getWidth() {
		return width;
	}
	/*Setter 메소드 사용방법
	 * public void set + 필드이름(매개변수타입 필드 타입){
	 * 		this.xxxx=xxxx;
	 * }
	 * 접근 제한자: public
	 * 리턴 타입: void
	 * 메소드 이름: set+필드이름(첫글자는 대문자)
	 * 매개변수타입: 필드 타입
	 */

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
