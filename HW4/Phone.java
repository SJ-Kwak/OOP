/*hw4 ��ǻ�Ͱ��а� 2076016 ������*/
import java.util.*;//scanner Ŭ������ hashtable import
public class Phone {
	private String name;//�ʵ� ����
	private String address;
	private String phonenum;
	
	public Phone(String name, String address, String phonenum) {//name, address, phonenum�� �Ű������� �ϴ� ������
		this.name=name;
		this.address=address;
		this.phonenum=phonenum;
	}
	
	//private���� ����� �ʵ� getter�� setter �޼ҵ� ����
	void setName(String name) {
		this.name=name;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	String getPhonenum() {
		return phonenum;
	}
	
	static Scanner s=new Scanner(System.in);//Ű���� �Է��� ���� ��ĳ�� ��ü ����. static�� ����Ͽ� Ŭ���� ��ü���� ��� �����ϰ� ��
	
	//����
	static void insert(Hashtable<String,Phone> info) {//info Hashtable�� �Ű������� �ϴ� insert �޼ҵ�
		String name, address, phonenum;
		System.out.print("�̸�>>");
		name=s.nextLine();//�̸� �Է�
		if(info.containsKey(name))//��ϵ� �̸��� ��� �Ǵ�
			System.out.println("�̹� �����ϴ� ����Դϴ�.");
		else {//��ϵ��� ���� �̸��� ��� �ּҿ� ��ȭ��ȣ ���� �Է�
			System.out.print("�ּ�>>");
			address=s.nextLine();
			System.out.print("��ȭ��ȣ>>");
			phonenum=s.nextLine();
			Phone phone=new Phone(name,address,phonenum);//phone ��ü ���� �� �ʱ�ȭ
			info.put(phone.getName(), phone);//Hashtable�� Key�� �̸�, Value�� phone ��ü ����
		}
	}
	//����
	static void delete(Hashtable<String, Phone> info) {//info Hashtable�� �Ű������� �ϴ� delete �޼ҵ�
		String deletename;
		System.out.print("�̸�>>");
		deletename=s.nextLine();//�̸� �Է�
		if(info.containsKey(deletename)) {//��ϵ� ������� ��� �Ǵ�
			info.remove(deletename);//Hashtable���� ����
			System.out.println(deletename+"���� �����Ǿ����ϴ�.");
		}
		else //��ϵ��� ���� ������� ��� �޽��� ���
			System.out.println("��ϵ��� ���� ����Դϴ�.");
	}
	//ã��
	static void search(Hashtable<String, Phone> info) {//info Hashtable�� �Ű������� �ϴ� search �޼ҵ�
		String searchname;
		System.out.print("�̸�>>");
		searchname=s.nextLine();//�̸� �Է�
		if(info.containsKey(searchname))//��ϵ� ������� ��� �Ǵ�
			System.out.println(searchname+" - "+info.get(searchname).getAddress()+" - "+info.get(searchname).getPhonenum());
			//�˻��� ������� �̸�, �ּ�, ��ȭ��ȣ ���
		else //��ϵ��� ���� ������� ��� �޽��� ���
			System.out.println("��ϵ��� ���� ����Դϴ�.");
	}
	//��ü����
	static void printAll(Hashtable<String, Phone> info) {//info Hashtable�� �Ű������� �ϴ� printAll �޼ҵ�
		Set<String> names=info.keySet();//Hashtable�� �ִ� ��� Ű�� ���� Set<String> �÷��� names
		Iterator<String> it=names.iterator();//names �÷����� ��� ���� �˻� �������̽� Iterator<String> it
		while(it.hasNext()) {//��� ��� �湮
			String name=it.next();//���� ��� ����
			Phone student=info.get(name);//Hashtable info�� �̸����� student ��ü�� ����
			System.out.println(name+" "+student.getAddress()+" "+student.getPhonenum());//�̸�, �ּ�, ��ȭ��ȣ ���
		}
	}
	
	public static void main(String[] args) {//���� �޼ҵ�
		Scanner s=new Scanner(System.in);
		Hashtable<String,Phone> info=new Hashtable<String,Phone>();//Hashtable ����
		int choose=-1;//�޴� ����
		boolean check=true;//���� ����
		System.out.println("-----------------------------------");
		System.out.println("*��ȭ��ȣ ���� ���α׷�*");
		System.out.println("-----------------------------------");
		
		while(check) {//check�� true�� ��
			System.out.print("����:0, ����:1, ã��:2, ��ü����:3, ����:4 >>");
			try {
				choose=s.nextInt();//�޴� ���� �Է�
			}catch(InputMismatchException e) {//������ �ƴ� ���ڸ� �Է����� �� ���� ó��
				System.out.println("���ڸ� �Է��ϼ���.");
				s.nextLine();//��ū �����
				continue;//�ٽ� �޴� �Է�
			}
			switch(choose) {//���� ���� choose. switch��
				case 0:
					insert(info);//���� �޼ҵ�
					break;
				case 1:
					delete(info);//���� �޼ҵ�
					break;
				case 2:
					search(info);//ã�� �޼ҵ�
					break;
				case 3:
					printAll(info);//��ü ���� �޼ҵ�
					break;
				case 4://����
					System.out.println("���α׷��� �����մϴ�.");
					check=false;//while �ݺ����� ���� check������ false��.
					break;
				default://0~4�� �ƴ� �ٸ� ���� �Է� �� ���Է�
					System.out.println("0~4 ������ ������ �Է��ϼ���.");	
			}
		}
		s.close();
	}
}

