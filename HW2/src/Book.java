//#2-4
//���̺귯�� Ŭ���� Book
class Book {//Ŭ���� ���������� default
	//�ʵ� ����. ���������� private
	private int num;
	private String title;
	private String author;
	
	public Book() {	}//�⺻ ������
	
	public Book(int num, String title, String author) {//������
		this.num=num;//�������� this ���
		this.title=title;
		this.author=author;
	}
	
	//Book num ���� title�� author�� �Է��Ͽ� ����ϴ� ������
	public Book(String title, String author) {//������ �����ε�
		this(0, title, author);//������ ȣ�� this ���
	}
	
	public int getNum() {//getter�޼ҵ�
		return num;
	}

	public void setNum(int num) {//setter�޼ҵ�
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
	
	public void show() {//��¸޼ҵ�
		System.out.println("���� ��ȣ: "+num+" | ������: "+title+" | ����: "+author);
	}

	public void show(int num) {//Ư�� ������ ����ϴ� �޼ҵ�. �޼ҵ� �����ε�
		System.out.println("������: "+title+" | ����: "+author);
	}
}
