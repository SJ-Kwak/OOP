
public class ByTwos implements Series {//인터페이스 구현
	int start;//필드 생성
	int val;
	
	public ByTwos() {//생성자
		start=0;
		val=0;
	}
	
	@Override
	public int getNext() {//추상메소드
		// TODO Auto-generated method stub
		val+=2;
		return val;
	}

	@Override
	public void reset() {//추상메소드
		// TODO Auto-generated method stub
		start =0;
		val=0;
	}

	@Override
	public void setStart(int x) {//추상메소드
		// TODO Auto-generated method stub
		start=x;
		val=x;
	}

}
