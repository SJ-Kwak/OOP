import java.util.HashSet;
import java.util.Iterator;
//import java.util.*;
public class HashSetEx {
	/*HashSet �ڷᱸ��
	 * 1. �ߺ��Ǵ� �ڷ� ��� x
	 * 2. list �ڷᱸ��ó�� �ε����� ���⿡ ���� ��� x
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("blue");
		set.add("green");
		set.add("black");
		System.out.println(set);
		System.out.println("element����: "+set.size());
		System.out.println();
		set.add("white");
		Iterator<String> it=set.iterator();//�÷��� �����˻�
		while(it.hasNext())//���� �����Ͱ� ������ true ��ȯ
			System.out.println(it.next());//���� ��� ��ȯ
		System.out.println("element����: "+set.size());
	}

}
