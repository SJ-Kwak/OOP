import java.util.*;
public class CompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));//line���� ����
		String s1=sc.next();
		String s2=sc.next();
		
		//StringTokenizer Ŭ������ java.util ��Ű�� import �ؾ���
		StringTokenizer st1=new StringTokenizer(s1);
		StringTokenizer st2=new StringTokenizer(s2);
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {//��Ʈ���� token�� ���������� true
			if((st1.nextToken()).compareTo(st2.nextToken())==0)//���� ��ū ��ȯ
				//st1�� ��ū�� st2�� ��ū ��. ���� ������ 0
				System.out.println("����");
			else System.out.println("�ٸ���");
		}
		
		if(st1.hasMoreTokens())//s1�� ��ū�� ���������� s1�� ���
			System.out.println("s1�� ���");
		else if(st2.hasMoreTokens())//s2�� ��ū�� ���������� s2�� ���
			System.out.println("s2�� ���");
		sc.close();
	}

}
