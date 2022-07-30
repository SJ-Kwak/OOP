
public class DicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("apple");
		String s2=new String("cherry");
		
		int check=s1.compareTo(s2);//문자열 비교. s1문자열을 매개 변수 안의 s2와 비교.
		//사전 순으로 비교하여 s1이 s2와 같으면 0, s1이 s2보다 길이가 짧거나 사전 순서가 앞이면 -1, s1이 s2보다 길이가 길거나 사전 순서가 뒤면 1
		if(check<0)//s1이 s2보다 앞이거나 길이가 짧을 때
			System.out.println(s1+"-"+s2);
		else if(check==0)//s1이 s2와 같을 때
			System.out.println(s1);
		else//s1이 s2보다 길이가 길거나 뒤일 때
			System.out.println(s2+"-"+s1);
	}

}
