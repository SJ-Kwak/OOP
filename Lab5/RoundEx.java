//���� Ŭ����
public class RoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Round[] c; //Round �迭�� ���� ���۷��� c ����
		c = new Round[5]; //5���� ���۷��� �迭 ����. �迭�� ����: ��ü x. Ŭ���� ��ü�� ���� ���۷���
		
		for(int i=0;i<c.length;i++)
			c[i]=new Round(i);//Ŭ���� ��ü �ϳ��� �����Ͽ� �迭�� �� ���۷����� ����.
		//Ŭ���� ��ü �迭 ����
		
		for(int i=0;i<c.length;i++)
			System.out.print((int)c[i].getArea()+" ");//��� ���۷��� �迭�� ���� ���
	}

}
