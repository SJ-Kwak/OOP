//���� Ŭ����
public class SupersonicEx {

	public static void main(String[] args) {
		Supersonic sa = new Supersonic();
		sa.takeoff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		//supersonic Ŭ������ ��� supersonic=2 ȣ��.
		//flymode=1 != supersonic=2 => ����!!
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		//supersonic Ŭ������ ��� normal=1 ȣ��
		//flymode=1 == normal=1 => ������ ����!!!
		sa.fly();
		sa.land();

	}

}
