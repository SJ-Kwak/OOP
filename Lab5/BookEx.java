//���� Ŭ����
import java.util.Scanner;
public class BookEx {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {//book.length=2
			System.out.print("����>>");
			String title = s.nextLine();
			System.out.print("����>>");
			String author = s.nextLine();
			book[i]=new Book(title,author);//�迭���� ��ü ����
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("("+book[i].title+","+book[i].author+")");
		}
		s.close();

	}

}
