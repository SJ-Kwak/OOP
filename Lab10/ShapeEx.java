//���θ޼ҵ�.
public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle(3,4);//��ü ����
		t1.computeArea();//�޼ҵ� ȣ��
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
		
		DObject ob[]=new DObject[5];//��ü �迭 ����
		ob[0]=t1;//5���� ���۷��� �迭 ����. �迭 ����: ��üx. ��ü ���۷���O
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
		System.out.println("Rectangle�� ���");
		//Rectangle�� ��� ���
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof Rectangle)
				ob[i].show();
		}
		*/
		/*
		System.out.println("--------------------------------------------------");
		System.out.println("ColorTrinagle�� ���");
		//ColorTriangle�� ��� ���
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof ColorTriangle)
				ob[i].show();
		}
		 */
		//������ ���� Ŭ������ ���ǵ�. triangle, rectangle ���� ��� ������ ���ԵǱ� ����
		System.out.println("--------------------------------------------------");
		System.out.println("Triangle�� ���");
		//Triangle�� ��� ���
		for(int i=0;i<ob.length;i++) {
			if(ob[i] instanceof Triangle && !(ob[i] instanceof ColorTriangle))
				ob[i].show();
		}
	}

}
