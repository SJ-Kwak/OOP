//���� Ŭ����
public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members=new Member[5];//��ü �迭 ����
		members[0]=new Member(1,"spring","�躸��");
		members[1]=new Member(2,"cider","�̽ÿ�");
		members[2]=new Member(3,"park","�ڼ���");
		members[3]=new Member(4,"lee","�̻���");
		members[4]=new Member(5,"kim","����ȭ");
		
		for(int i=0;i<members.length;i++) {
			System.out.printf("%d�� ȸ�� ���̵�: %s, �̸�: %s \n", members[i].no,members[i].id,members[i].name);
		}
	}
}
