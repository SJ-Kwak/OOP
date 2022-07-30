
public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		do {//조건 검사 이전에 블록 안의 문장 일단 수행.
			System.out.print(c);
			c=(char)(c+1);//1을 더하면 다음 알파벳 나타냄.
		}while(c<='z');
	}

}
