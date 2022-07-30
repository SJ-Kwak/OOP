import java.util.Stack;
public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<Integer>();//stack 정수형 객체 생성
		if(s.empty())//스택이 비어있는지 점검
			System.out.println("스택이 비어있다!");
		//요소 삽입
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		
		System.out.println(s.pop());//stack top의 객체 제거하면서 반환
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s);//스택 전체 출력
	}

}
