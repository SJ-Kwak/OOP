import java.util.Stack;
public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<Integer>();//stack ������ ��ü ����
		if(s.empty())//������ ����ִ��� ����
			System.out.println("������ ����ִ�!");
		//��� ����
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		
		System.out.println(s.pop());//stack top�� ��ü �����ϸ鼭 ��ȯ
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s);//���� ��ü ���
	}

}
