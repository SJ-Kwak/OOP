
public class DicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("apple");
		String s2=new String("cherry");
		
		int check=s1.compareTo(s2);//���ڿ� ��. s1���ڿ��� �Ű� ���� ���� s2�� ��.
		//���� ������ ���Ͽ� s1�� s2�� ������ 0, s1�� s2���� ���̰� ª�ų� ���� ������ ���̸� -1, s1�� s2���� ���̰� ��ų� ���� ������ �ڸ� 1
		if(check<0)//s1�� s2���� ���̰ų� ���̰� ª�� ��
			System.out.println(s1+"-"+s2);
		else if(check==0)//s1�� s2�� ���� ��
			System.out.println(s1);
		else//s1�� s2���� ���̰� ��ų� ���� ��
			System.out.println(s2+"-"+s1);
	}

}
