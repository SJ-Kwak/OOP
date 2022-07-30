
public class SeriesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTwos ob = new ByTwos();//°´Ã¼ »ý¼º
		for(int i=0;i<5;i++)
			System.out.println("Next value is "+ob.getNext());
		System.out.println("\nResetting");
		for(int i=0;i<5;i++)
			System.out.println("Next value is "+ob.getNext());
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		for(int i=0;i<5;i++)
			System.out.println("Next value is "+ob.getNext());
	}

}
