
public class Demo9 {

	public static void main(String[] args) {
		String a="banana,apple,pineapple,grape,mango,guava,kiwi,cherry";
		String b[];
		b=a.split(",");
		
		for(int i=0;i<b.length;i++)
			System.out.println("�и���"+i+"�� ���ڿ�: "+b[i]);
		System.out.println();

	}

}
