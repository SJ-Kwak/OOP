//���� Ŭ����
public class MethodSampleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample a=new MethodSample();
		int i=a.getSum(1, 2);//�Ű����� 2���� ������ getSum ȣ��
		int j=a.getSum(1,2,3);//�Ű����� 3���� ������ getSum ȣ��
		double k=a.getSum(1.1, 2.2);//�Ű����� 2���� �Ǽ��� getSum ȣ��
		
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.printf("k=%.2f",k);
	}

}
