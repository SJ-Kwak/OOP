//���̺귯�� Ŭ����
public class ArrayParameter {
	static void replaceSpace(char a[]) {//���� �޼ҵ�. Ŭ���� �ε� ���� ���ĺ��� �ٷ� ���. 
		//�޸� �Ҵ� �� ���� �̷����. �޸� ��� ȿ����. �����ϰ� ����ϸ� ���ʿ��� �޸� ���.
		for(int i=0;i<a.length;i++)
			if(a[i] == ' ')
				a[i] = ','; //���� ���ڸ� , �� ����
	}
	
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]); //�迭 ���� ���� ����
		System.out.println(); //�迭 ���� ��� ��� �� �ٹٲ�
	}

}
