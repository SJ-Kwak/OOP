//���̺귯�� Ŭ����
public class Rectangle {
	private double width, height, area; //�غ�, ����, ����
	//private: ��� �ܺ� Ŭ�������� ���� �Ұ�
	public Rectangle(double w, double h) {//������
		width=w;
		height=h;
	}
	
	public double ComputeArea() {
		area=width*height;
		return area;
	}
	public double ShowWidth() {
		return width;
	}
	public double ShowHeight() {
		return height;
	}

	/*Getter �޼ҵ� �����
	 * public �ʵ�Ÿ�� get + �ʵ��̸�(){
	 * 		return �ʵ尪:
	 * }
	 * ����������: public ����
	 * ���� Ÿ��: �ʵ� Ÿ��
	 * �޼ҵ� �̸�: get+�ʵ��̸�(ù���ڴ� �빮��)
	 * ���ϰ�: �ʵ尪
	 */
	public double getWidth() {
		return width;
	}
	/*Setter �޼ҵ� �����
	 * public void set + �ʵ��̸�(�Ű�����Ÿ�� �ʵ� Ÿ��){
	 * 		this.xxxx=xxxx;
	 * }
	 * ���� ������: public
	 * ���� Ÿ��: void
	 * �޼ҵ� �̸�: set+�ʵ��̸�(ù���ڴ� �빮��)
	 * �Ű�����Ÿ��: �ʵ� Ÿ��
	 */

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
