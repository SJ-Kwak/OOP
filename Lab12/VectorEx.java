import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();//���� ���� Vector ��ü ����
		v.add(10);//��ü ����
		v.add(20);
		v.add(30);
		v.add(2,25);//���� �ε����� ��ü ����
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
		System.out.println();
		
		v.remove(2);
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	}

}
