
public class GMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){
		//T�� Ÿ�� �Ű������� ���׸� �޼ҵ�
		GStack<T> s=new GStack<T>();//���� a�� �ݴ�� ������ GStack ����
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null)//������ ����ִ� ���
				break;
			else
				s.push(tmp);//�� ���ÿ� ��Ҹ� ����
		}
		return s;//�� ������ ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Integer> gs=new GStack<Integer>();
		for(int i=0;i<5;i++) {
			gs.push(i);
		}
		gs=reverse(gs);
		for(int i=0;i<5;i++) {
			System.out.println(gs.pop());
		}
		GStack<String> gs1=new GStack<String>();
		gs1.push("Apple");
		gs1.push("Banana");
		gs1.push("Orange");
		gs1=reverse(gs1);
		for(int i=0;i<3;i++)
			System.out.println(gs1.pop());
	}

}
