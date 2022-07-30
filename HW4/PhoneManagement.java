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
		System.out.print("이름>>");
		name=s.nextLine();
		if(info.containsKey(name))
			System.out.println("이미 존재하는 사람입니다.");
		else {
			System.out.print("주소>>");
			address=s.nextLine();
			System.out.print("전화번호>>");
			phonenum=s.nextLine();
			Phone phone=new Phone(name,address,phonenum);
			info.put(phone.getName(), phone);
		}
	}
	
	static void delete(Hashtable<String, Phone> info) {
		String deletename;
		System.out.print("이름>>");
		deletename=s.nextLine();
		if(info.containsKey(deletename)) {
			info.remove(deletename);
			System.out.println(deletename+"님은 삭제되었습니다.");
		}
		else 
			System.out.println("등록되지 않은 사람입니다.");
	}
	
	static void search(Hashtable<String, Phone> info) {
		String searchname;
		System.out.print("이름>>");
		searchname=s.nextLine();
		if(info.containsKey(searchname))
			System.out.println(searchname+" - "+info.get(searchname).getAddress()+" - "+info.get(searchname).getPhonenum());
		else
			System.out.println("등록되지 않은 사람입니다.");
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
		System.out.println("*전화번호 관리 프로그램*");
		System.out.println("-----------------------------------");
		
		while(check) {
			System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4 >>");
			try {
				choose=s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
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
					System.out.println("프로그램을 종료합니다.");
					check=false;
					break;
				default:
					System.out.println("0~4 사이의 정수를 입력하세요.");	
			}
		}
		s.close();
	}
	
}
