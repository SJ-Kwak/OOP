
public class Demo6 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=s1.replace("He","ABC");//He �κ��� ABC�� ��ü
		System.out.println(s2);
		
		String s3="cherry apple banana";
		String fruits[]=s3.split(" ");//������ �������� ���ڿ� split
		for(int i=0;i<fruits.length;i++)
			System.out.println(fruits[i]+" ");

	}

}
