
public class ByTwos implements Series {//�������̽� ����
	int start;//�ʵ� ����
	int val;
	
	public ByTwos() {//������
		start=0;
		val=0;
	}
	
	@Override
	public int getNext() {//�߻�޼ҵ�
		// TODO Auto-generated method stub
		val+=2;
		return val;
	}

	@Override
	public void reset() {//�߻�޼ҵ�
		// TODO Auto-generated method stub
		start =0;
		val=0;
	}

	@Override
	public void setStart(int x) {//�߻�޼ҵ�
		// TODO Auto-generated method stub
		start=x;
		val=x;
	}

}
