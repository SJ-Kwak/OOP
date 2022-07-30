
public class Demo6 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=s1.replace("He","ABC");//He 부분을 ABC로 대체
		System.out.println(s2);
		
		String s3="cherry apple banana";
		String fruits[]=s3.split(" ");//공백을 기준으로 문자열 split
		for(int i=0;i<fruits.length;i++)
			System.out.println(fruits[i]+" ");

	}

}
