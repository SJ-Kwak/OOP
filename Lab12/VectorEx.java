import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();//Á¤¼ö ÀúÀå Vector °´Ã¼ »ı¼º
		v.add(10);//°´Ã¼ »ğÀÔ
		v.add(20);
		v.add(30);
		v.add(2,25);//ÁöÁ¤ ÀÎµ¦½º¿¡ °´Ã¼ »ğÀÔ
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
		System.out.println();
		
		v.remove(2);
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	}

}
