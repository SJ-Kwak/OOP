/*hw4 컴퓨터공학과 2076016 곽서진*/
import java.util.*;//scanner 클래스와 hashtable import
public class Phone {
	private String name;//필드 선언
	private String address;
	private String phonenum;
	
	public Phone(String name, String address, String phonenum) {//name, address, phonenum을 매개변수로 하는 생성자
		this.name=name;
		this.address=address;
		this.phonenum=phonenum;
	}
	
	//private으로 선언된 필드 getter와 setter 메소드 생성
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
	
	static Scanner s=new Scanner(System.in);//키보드 입력을 위한 스캐너 객체 선언. static을 사용하여 클래스 전체에서 사용 가능하게 함
	
	//삽입
	static void insert(Hashtable<String,Phone> info) {//info Hashtable을 매개변수로 하는 insert 메소드
		String name, address, phonenum;
		System.out.print("이름>>");
		name=s.nextLine();//이름 입력
		if(info.containsKey(name))//등록된 이름일 경우 판단
			System.out.println("이미 존재하는 사람입니다.");
		else {//등록되지 않은 이름일 경우 주소와 전화번호 마저 입력
			System.out.print("주소>>");
			address=s.nextLine();
			System.out.print("전화번호>>");
			phonenum=s.nextLine();
			Phone phone=new Phone(name,address,phonenum);//phone 객체 생성 및 초기화
			info.put(phone.getName(), phone);//Hashtable의 Key에 이름, Value에 phone 객체 저장
		}
	}
	//삭제
	static void delete(Hashtable<String, Phone> info) {//info Hashtable을 매개변수로 하는 delete 메소드
		String deletename;
		System.out.print("이름>>");
		deletename=s.nextLine();//이름 입력
		if(info.containsKey(deletename)) {//등록된 사용자일 경우 판단
			info.remove(deletename);//Hashtable에서 삭제
			System.out.println(deletename+"님은 삭제되었습니다.");
		}
		else //등록되지 않은 사용자일 경우 메시지 출력
			System.out.println("등록되지 않은 사람입니다.");
	}
	//찾기
	static void search(Hashtable<String, Phone> info) {//info Hashtable을 매개변수로 하는 search 메소드
		String searchname;
		System.out.print("이름>>");
		searchname=s.nextLine();//이름 입력
		if(info.containsKey(searchname))//등록된 사용자일 경우 판단
			System.out.println(searchname+" - "+info.get(searchname).getAddress()+" - "+info.get(searchname).getPhonenum());
			//검색된 사용자의 이름, 주소, 전화번호 출력
		else //등록되지 않은 사용자일 경우 메시지 출력
			System.out.println("등록되지 않은 사람입니다.");
	}
	//전체보기
	static void printAll(Hashtable<String, Phone> info) {//info Hashtable을 매개변수로 하는 printAll 메소드
		Set<String> names=info.keySet();//Hashtable에 있는 모든 키를 담은 Set<String> 컬렉션 names
		Iterator<String> it=names.iterator();//names 컬렉션의 요소 순차 검색 인터페이스 Iterator<String> it
		while(it.hasNext()) {//모든 요소 방문
			String name=it.next();//다음 요소 리턴
			Phone student=info.get(name);//Hashtable info의 이름으로 student 객체에 저장
			System.out.println(name+" "+student.getAddress()+" "+student.getPhonenum());//이름, 주소, 전화번호 출력
		}
	}
	
	public static void main(String[] args) {//메인 메소드
		Scanner s=new Scanner(System.in);
		Hashtable<String,Phone> info=new Hashtable<String,Phone>();//Hashtable 생성
		int choose=-1;//메뉴 변수
		boolean check=true;//조건 변수
		System.out.println("-----------------------------------");
		System.out.println("*전화번호 관리 프로그램*");
		System.out.println("-----------------------------------");
		
		while(check) {//check가 true일 때
			System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4 >>");
			try {
				choose=s.nextInt();//메뉴 선택 입력
			}catch(InputMismatchException e) {//정수가 아닌 문자를 입력했을 시 예외 처리
				System.out.println("숫자만 입력하세요.");
				s.nextLine();//토큰 지우기
				continue;//다시 메뉴 입력
			}
			switch(choose) {//선택 변수 choose. switch문
				case 0:
					insert(info);//삽입 메소드
					break;
				case 1:
					delete(info);//삭제 메소드
					break;
				case 2:
					search(info);//찾기 메소드
					break;
				case 3:
					printAll(info);//전체 보기 메소드
					break;
				case 4://종료
					System.out.println("프로그램을 종료합니다.");
					check=false;//while 반복문의 조건 check변수를 false로.
					break;
				default://0~4가 아닌 다른 숫자 입력 시 재입력
					System.out.println("0~4 사이의 정수를 입력하세요.");	
			}
		}
		s.close();
	}
}

