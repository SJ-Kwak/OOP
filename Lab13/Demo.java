import java.util.Stack;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		String in="a b a b c c c # c c c b a b a";
		boolean check=true;
		String p[]=in.split(" ");//��Ʈ�� in�� ���� ������ �и�
		for(int i=0;i<(p.length/2);i++)//���ݱ��� �ݺ�
			stack.push(p[i]);//���ÿ� p�� ���� ����. ���ݸ�.
		System.out.println(stack);
		for(int i=(p.length/2 +1);i<p.length;i++) {//���� ���� �ε�������
			String top=stack.pop();//���� ���� ���� �� ��ȯ�ؼ� top�� ����
			System.out.print("top:"+top);//���� ���� ��
			System.out.printf("-->p[%d]:%s",i,p[i]);
			System.out.println();
			System.out.println(stack);
			//���� ���� ��(���� ���߿� ���� ��)���� �ϳ��� ���ʷ� ������ ���·� ��ȯ
			if(top.equals(p[i]));
			else {
				check=false;
				break;
			}
		}
		if(check)
			System.out.println("�´�");
		else
			System.out.println("Ʋ����");
	}

}
