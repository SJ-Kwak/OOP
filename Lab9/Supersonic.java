//����Ŭ����
public class Supersonic extends Airplane {//�Ϲ� + ������ ���� ���
	public static final int NORMAL = 1;//��� ����
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;//flyMode=1;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ����!!!");
		}else {
			super.fly();	
		}
	}
	
	
}
