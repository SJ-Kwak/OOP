//����Ŭ����
public class A {
	int a1, a2;
	
	public A() {//default ������ �߰�
		System.out.println("A");//�� �����ڰ� ȣ��Ǿ����� �˸��� ��¹�
	}
	/*������
	 * 1. �������� �޼ҵ��=Ŭ���� �̸�
	 * 2. ������ �տ� ���� ���������ڴ� �ݵ�� public
	 * 3. ���ϰ� x
	 */
	
	public A(int a1, int a2) {//�߰��� �Ű����� 2�� ������
		this.a1=a1;
		this.a2=a2;
	}
	/*public void setA(int a1, int a2) {//�޼ҵ� ����
		this.a1=a1;
		this.a2=a2;
	}*/
	
	public void showA() {//�޼ҵ� ����
		System.out.println(a1+","+a2);
	}
}
