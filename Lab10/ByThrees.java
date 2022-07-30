
public class ByThrees implements Series {
	int start;
	int val;
	
	public ByThrees() {
		start=0;
		val=0;
	}
	
	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val+=3;
		return val;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		start=0;
		val=0;
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start=x;
		val=x;
	}

}
