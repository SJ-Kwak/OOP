//#2-4
//라이브러리 클래스 Book
class Book {//클래스 접근지정자 default
	//필드 선언. 접근지정자 private
	private int num;
	private String title;
	private String author;
	
	public Book() {	}//기본 생성자
	
	public Book(int num, String title, String author) {//생성자
		this.num=num;//참조변수 this 사용
		this.title=title;
		this.author=author;
	}
	
	//Book num 없이 title과 author만 입력하여 사용하는 생성자
	public Book(String title, String author) {//생성자 오버로딩
		this(0, title, author);//생성자 호출 this 사용
	}
	
	public int getNum() {//getter메소드
		return num;
	}

	public void setNum(int num) {//setter메소드
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void show() {//출력메소드
		System.out.println("도서 번호: "+num+" | 도서명: "+title+" | 저자: "+author);
	}

	public void show(int num) {//특정 도서만 출력하는 메소드. 메소드 오버로딩
		System.out.println("도서명: "+title+" | 저자: "+author);
	}
}
