//main()���� ����� ������ ���
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		for(int i=0;i<args.length;i++)//���ڰ�����ŭ �ݺ�
			sum+=Double.parseDouble(args[i]);//args�� string type�̴ϱ� double �Ǽ� type���� ��ȯ.
			System.out.println("�հ�: "+sum);
			//run configuration���� ����.

	}

}
