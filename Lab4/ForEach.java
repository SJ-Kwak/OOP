
public class ForEach {
	enum Week {��, ȭ, ��, ��, ��, ��, ��}//������ enum Week�� ���Ż�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};//������ �迭
		int sum=0;
		String names[]= {"����", "ü��", "�ٳ���", "����"};//���ڿ�
		
		for(int k:n) {//n.length��ŭ �ݺ�
			System.out.print(k+" ");//�ݺ��Ǵ� k�� ���
			sum+=k;
		}
		System.out.println("���� "+sum);
		
		for(String s:names) {//names.length��ŭ �ݺ�
			System.out.print(s+" ");//������� ���
		}
		System.out.println();
		
		for(Week day: Week.values())//������ enum�� ���ǵ� ����� ���
			System.out.print(day+"���� ");
			System.out.println();
	}

}
