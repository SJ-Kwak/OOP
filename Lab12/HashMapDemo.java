import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();//key-value ���� ���·� ������ ����
		//��� ����
		h.put(1001, "����ȭ");
		h.put(1003, "����ȭ");
		h.put(1010, "����ȭ");
		h.put(1004, "����ȭ");
		
		System.out.println(h.get(1003));//��� �˻�
		
		Set<Integer> key=h.keySet();//���� key���� set ���·� ��ȯ
		Iterator<Integer> it=key.iterator();//key ���� �˻�
		
		System.out.println("=====");
		while(it.hasNext()) {
			System.out.println(h.get(it.next()));
		}
	}

}
