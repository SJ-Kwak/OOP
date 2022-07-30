import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();//key-value 쌍의 형태로 데이터 저장
		//요소 삽입
		h.put(1001, "김이화");
		h.put(1003, "박이화");
		h.put(1010, "최이화");
		h.put(1004, "한이화");
		
		System.out.println(h.get(1003));//요소 검색
		
		Set<Integer> key=h.keySet();//맵의 key들을 set 형태로 반환
		Iterator<Integer> it=key.iterator();//key 순차 검색
		
		System.out.println("=====");
		while(it.hasNext()) {
			System.out.println(h.get(it.next()));
		}
	}

}
