//메인메소드.
public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle(3,4);//객체 생성
		t1.computeArea();//메소드 호출
		t1.show();
		
		Rectangle r1=new Rectangle(4,5);
		r1.ComputeArea();
		r1.show();
		
		ColorTriangle ct1=new ColorTriangle(6,7,"red");
		ct1.ComputeArea();
		ct1.show();
		
		Rectangle2 r2=new Rectangle2(7);
		r2.ComputeArea();
		r2.show();
		
		Rectangle r3=new Rectangle(10,12);
		r3.ComputeArea();
		r3.show();
		
		DObject ob[]=new DObject[5];//객체 배열 생성
		ob[0]=t1;//5개의 레퍼런스 배열 생성. 배열 원소: 객체x. 객체 레퍼런스O
		ob[1]=r1;
		ob[2]=ct1;
		ob[3]=r2;
		ob[4]=r3;
		
		/*
		System.out.println("--------------------------------------------------");
		for(int i=0;i<ob.length;i++) {
			ob[i].ComputeArea();
			ob[i].show();
		}
		*/
		/*
		System.out.println("--------------------------------------------------");
		System.out.println("Rectangle만 출력");
		//Rectangle만 골라서 출력
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof Rectangle)
				ob[i].show();
		}
		*/
		/*
		System.out.println("--------------------------------------------------");
		System.out.println("ColorTrinagle만 출력");
		//ColorTriangle만 골라서 출력
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof ColorTriangle)
				ob[i].show();
		}
		 */
		//도형이 상위 클래스로 정의됨. triangle, rectangle 등은 모두 도형에 포함되기 때문
		System.out.println("--------------------------------------------------");
		System.out.println("Triangle만 출력");
		//Triangle만 골라서 출력
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof Triangle && !(ob[i] instanceof ColorTriangle))
				ob[i].show();
		}
	}

}
