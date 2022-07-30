import java.util.HashSet;
import java.util.Iterator;
//import java.util.*;
public class HashSetEx {
	/*HashSet 자료구조
	 * 1. 중복되는 자료 허용 x
	 * 2. list 자료구조처럼 인덱스가 없기에 순서 상관 x
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
		System.out.println("element개수: "+set.size());
		System.out.println();
		set.add("white");
		Iterator<String> it=set.iterator();//컬렉션 순차검색
		while(it.hasNext())//다음 데이터가 있으면 true 반환
			System.out.println(it.next());//다음 요소 반환
		System.out.println("element개수: "+set.size());
	}

}
