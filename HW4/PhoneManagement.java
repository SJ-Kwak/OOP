import java.util.*;

public class PhoneManagement {
	static final int insert=0;
	static final int delete=1;
	static final int search=2;
	static final int show=3;
	static final int exit=4;
	
	static Scanner s=new Scanner(System.in);
	
	static void insert(Hashtable<String,Phone> info) {
		String name, address, phonenum;
		System.out.print("�̸�>>");
		name=s.nextLine();
		if(info.containsKey(name))
			System.out.println("�̹� �����ϴ� ����Դϴ�.");
		else {
			System.out.print("�ּ�>>");
			address=s.nextLine();
			System.out.print("��ȭ��ȣ>>");
			phonenum=s.nextLine();
			Phone phone=new Phone(name,address,phonenum);
			info.put(phone.getName(), phone);
		}
	}
	
	static void delete(Hashtable<String, Phone> info) {
		String deletename;
		System.out.print("�̸�>>");
		deletename=s.nextLine();
		if(info.containsKey(deletename)) {
			info.remove(deletename);
			System.out.println(deletename+"���� �����Ǿ����ϴ�.");
		}
		else 
			System.out.println("��ϵ��� ���� ����Դϴ�.");
	}
	
	static void search(Hashtable<String, Phone> info) {
		String searchname;
		System.out.print("�̸�>>");
		searchname=s.nextLine();
		if(info.containsKey(searchname))
			System.out.println(searchname+" - "+info.get(searchname).getAddress()+" - "+info.get(searchname).getPhonenum());
		else
			System.out.println("��ϵ��� ���� ����Դϴ�.");
	}
	
	static void printAll(Hashtable<String, Phone> info) {
		Set<String> names=info.keySet();
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			String name=it.next();
			Phone student=info.get(name);
			System.out.println(name+" "+student.getAddress()+" "+student.getPhonenum());
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Hashtable<String,Phone> info=new Hashtable<String,Phone>();
		int choose=-1;
		boolean check=true;
		System.out.println("-----------------------------------");
		System.out.println("*��ȭ��ȣ ���� ���α׷�*");
		System.out.println("-----------------------------------");
		
		while(check) {
			System.out.print("����:0, ����:1, ã��:2, ��ü����:3, ����:4 >>");
			try {
				choose=s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				s.nextLine();
				continue;
			}
			switch(choose) {
				case 0:
					insert(info);
					break;
				case 1:
					delete(info);
					break;
				case 2:
					search(info);
					break;
				case 3:
					printAll(info);
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					check=false;
					break;
				default:
					System.out.println("0~4 ������ ������ �Է��ϼ���.");	
			}
		}
		s.close();
	}
	
}
