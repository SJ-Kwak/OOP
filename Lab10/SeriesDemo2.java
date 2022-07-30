
public class SeriesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTwos twoOb = new ByTwos();//°´Ã¼ »ý¼º
		ByThrees threeOb = new ByThrees();
		Series ob;
		
		for(int i=0;i<5;i++) {
			ob=twoOb;
			System.out.println("Next ByTwos value is "+ob.getNext());
			ob=threeOb;
			System.out.println("Next ByThrees value is "+ob.getNext());
		}
	}

}
