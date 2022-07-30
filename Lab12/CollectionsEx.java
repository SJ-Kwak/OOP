import java.util.*;
public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> v=new ArrayList<String>();//문자열 arraylist 객체 생성
		v.add("kiwi");//요소 삽입
		v.add("pear");
		v.add("apple");
		v.add("banana");
		
		Collections.sort(v);//원소 정렬
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");//요소 알아내기
		}

	}

}
