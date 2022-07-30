//���̺귯�� Ŭ���� BookManagement
import java.util.InputMismatchException;
import java.util.Scanner;

class BookManagement {//Ŭ���� ���������� default
	Scanner s = new Scanner(System.in);//�Է°� ���� ��ĳ�� ��ü ����
	Book[] books = new Book[100];//Book Ŭ���� Ȱ���Ͽ� books ��ü �迭 ����. ������� ���� ����.
	//�ʵ� ����
	int num=1;//���� ��ȣ ����
	int select=0;//���� ��� ��� ��� ���� ����
	int selectNum=0;//Ư�� ���� ��� ���� ����
	String name;//�����
	String date;//�������
	boolean run=true;//boolean ����
	
	public BookManagement() {}//�⺻ ������
	
	public BookManagement(String name, String date) {//���� ����ΰ� ������� �����ϴ� ������. �Ű����� 2��
		this.name=name;
		this.date=date;
	}
	
	public void showUser() {//�����, ������� ��� �޼ҵ�.
		System.out.println("�����: "+name+" | �������: "+date);
	}
	
	public void registerBook() {//���� ��� �޼ҵ�
		System.out.println("1. ���� ���");
		System.out.print("����� ������ ������ �Է��ϼ���: ");
		String title = s.nextLine();//���� �Է�
		System.out.print("����� ������ ���ڸ� �Է��ϼ���: ");
		String author = s.nextLine();//���� �Է�
		
		Book b = new Book();//b ��ü ����
		//BookŬ�������� private���� ���ǵ� �޼ҵ带 BookManagement���� Ȱ���ϱ� ���� setter�޼ҵ� ȣ��.
		b.setNum(num);
		b.setTitle(title);
		b.setAuthor(author);
		books[num++]=b;//���� ���� ������ ������� �ε��� ����.
	}
	
	public void printBook() {//���� ��� ��� �޼ҵ�
		System.out.println("2. ���� ��� ���");
		System.out.print("(1) ��ü ���� ��� ��� | (2) Ư�� ���� ��� >>");
		try {
			select=s.nextInt();
		}catch(InputMismatchException e) {//������ �ƴ� ���� �Է� ��, ���� �߻�
			System.out.println("���� 1 �Ǵ� 2�� �Է��ϼ���!");
			s.nextLine();//��ū ����
			System.out.print("(1) ��ü ���� ��� ��� | (2) Ư�� ���� ��� >>");
			select=s.nextInt();//���Է�
		}
		switch(select) {//2���� ������.
		case 1://��ü ���� ��� ���
			for(int i=1;i<num;i++) {//1������ ���� ��ϵ� �������� ���� ���
				books[i].show();//BookŬ������ show�޼ҵ� ȣ��
			}
			break;
		case 2://Ư�� ���� ���
			while(true) {//���� �߻� ��, ����� ��Ȱ�ϰ� �ϱ� ���� while �ݺ��� ���
				System.out.print("����� ���ϴ� ������ ��ȣ�� �Է��ϼ���: ");
				try {
					selectNum=s.nextInt();//Ư�� ���� ��ȣ �Է�
				}catch(NullPointerException e) {//���� ��ϵ� ���� ������ ū ��ȣ�� �Է� �� ���� ó��
					System.out.println("���� �Էµ� ���� ��� ���� ��ȣ�� �Է��ϼ���");
					s.nextLine();
					System.out.print("����� ���ϴ� ������ ��ȣ�� �Է��ϼ���: ");
					try {selectNum=s.nextInt();
					}catch(InputMismatchException a) {//���� �ƴ� ���� �Է� �� ���� ó��
						System.out.println("�ڿ����� �Է��ϼ���!");
						s.nextLine();
						continue;
					}
				}catch(InputMismatchException e) {//���� �ƴ� ���� �Է� �� ���� ó��
					System.out.println("�ڿ����� �Է��ϼ���!");
					s.nextLine();
					System.out.print("����� ���ϴ� ������ ��ȣ�� �Է��ϼ���: ");
					try{selectNum=s.nextInt();
					}catch(NullPointerException a) {//���� ��ϵ� ���� ������ ū ��ȣ�� �Է� �� ���� ó��
						System.out.println("���� �Էµ� ���� ��� ���� ��ȣ�� �Է��ϼ���");
						s.nextLine();
						continue;
					}
				}
				try {
					books[selectNum].show(selectNum);//Ư�� ���� ���. �Ű������� ������ show�޼ҵ� ���
				}catch(NullPointerException e) {//���� ����� ���� �Ǽ����� ū ��ȣ ���� ��, null ���۷��� �����ϰ� ��. ���� �߻�
					System.out.println("���� �Էµ� ���� ��� ���� ��ȣ�� �Է��ϼ���");
					s.nextLine();
					continue;	
				}
				break;
			}
			break;//while�� Ż��.
		default: 
			System.out.println("���� 1 �Ǵ� 2�� �Է��ϼ���!");	//1,2�� �̿��� ��ȣ �Է� �� ����� ����� �� ����.	
			printBook();//�� �޼ҵ� �����.
		}
		
	}
}
