//라이브러리 클래스
public class Book {
	String title, author;
	
	public Book(String title, String author) {//매개변수 2개 생성자
		this.title = title;
		this.author = author;
		//this: 현재 타입에 대해. 객체가 있어야 사용.
		//클래스 내에서 멤버명에 접근할 때는 굳이 this 필드명 지정 필요x.
		//매개변수의 이름과 멤버 필드의 이름이 같을 경우, 멤버필드에 this 레퍼런스를 붙여 this.멤버필드와 매개변수 이름을 구분하게 함.
	}

}
