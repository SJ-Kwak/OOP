import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{(a+b)*(c+d)+e}/{(f-(g-h))*(i+j)}";
		StringTokenizer st=new StringTokenizer(s,"{ } ( )", true);
		//��ȣ�� ��ū���� ���
		//{ } ( )�� ���� ���ڷ� ��. �߰�ȣ�� �Ұ�ȣ ��ū���� ���ڿ��� ���� ���� ����
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
