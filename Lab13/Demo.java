import java.util.Stack;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		String in="a b a b c c c # c c c b a b a";
		boolean check=true;
		String p[]=in.split(" ");//스트링 in을 공백 단위로 분리
		for(int i=0;i<(p.length/2);i++)//절반까지 반복
			stack.push(p[i]);//스택에 p의 원소 삽입. 절반만.
		System.out.println(stack);
		for(int i=(p.length/2 +1);i<p.length;i++) {//절반 이후 인덱스부터
			String top=stack.pop();//스택 제일 위에 거 반환해서 top에 저장
			System.out.print("top:"+top);//제일 위에 거
			System.out.printf("-->p[%d]:%s",i,p[i]);
			System.out.println();
			System.out.println(stack);
			//제일 위에 거(제일 나중에 넣은 거)부터 하나씩 차례로 제거한 상태로 반환
			if(top.equals(p[i]));
			else {
				check=false;
				break;
			}
		}
		if(check)
			System.out.println("맞다");
		else
			System.out.println("틀리다");
	}

}
