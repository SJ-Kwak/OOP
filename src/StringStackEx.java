
public class StringStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new StringStack(10);
		
		for(int i=0;;i++) {
			s.push("¹®ÀÚ¿­ "+i);
		}
		
		for(int i=0;;i++)
			System.out.println(s.pop());

	}

}
