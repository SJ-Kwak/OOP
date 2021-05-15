
public class StringStack implements Stack {
	String array[];
	int index;
	
	public StringStack(int capacity) {
		array=new String[capacity];
		index=0;
	}

	@Override
	public int length() {
		return array.length;
	}

	@Override
	public Object pop() {
		if(index==0)
			return null;
		index--;
		return array[index];
	}

	@Override
	public void push(Object ob) {
		array[index++]=(String)ob;
	}

}
