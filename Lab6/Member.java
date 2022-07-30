//라이브러리 클래스
public class Member {
	int no;//회원 번호
	String id;//회원 id
	String name;//회원 이름
	
	public Member(int no, String id, String name) {//매개변수 3개인 생성자
		this.no=no;//생성자와 메소드의 매개변수 이름이 필드와 동일한 경우, 인스턴스 멤버인 필드임을 명시하기 위해 사용
		this.id=id;
		this.name=name;
	}
}
