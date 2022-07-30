//�������̽� ���� Ŭ����
public class GradStudent implements Student {
	String name;//�̸� ���� ����
	double[][]score=new double[4][3];//������ �迭. ��: �б�, ��: ����
	double scoreavg[]=new double[4];//�б���� ���� �迭.
	int semester;//�б�� ���� ����
	double avgtotal=0;//����� ���� ����
	
	public GradStudent(String name) {//name�� �Ű������� �ϴ� ������
		this.name=name;
	}
	
	@Override
	public void showStudentInfo() {//�л� ���� ��� �޼ҵ�
		System.out.println("===================================================");
		System.out.println("���п� "+semester+"�б� "+name);

	}

	@Override
	public void addSemester(int i, double[] s) {//�б⺰ ���� ���� ��� �޼ҵ�
		semester=i;//�б� ����
		double scoresum=0.0;//���� �ջ� ���� ���� �� �ʱ�ȭ
		for(int j=0;j<3;j++) {//3���� ���� �ջ�
			score[semester][j]=s[j];//������ �迭�� '��'�� ����Ŭ�������� ���� ���� ���� ����
			scoresum+=score[semester][j];//���� ���� �ջ�
		}
		scoreavg[semester-1]=scoresum/3;//�б⺰ ���� ���� ��� ����. semester�� �б� ������ 1���� �����ϱ� ������ �迭���� ����� ���� semester-1�� ���ش�.
		avgtotal+=scoreavg[semester-1];//�б⺰ ����� �ջ��Ͽ� ����տ� ����.
	}

	@Override
	public void showScore() {//�б⺰ ����, ��� ��� �޼ҵ�
		for(int m=1;m<=semester;m++) {//�б� ���
			System.out.print(m+"�б�: ");
			for(int n=0;n<3;n++) {//�б⺰ ���� ���� ���
				System.out.print(score[m][n]+" ");
			}
			System.out.printf("�б� ���= %.2f \n",scoreavg[m-1]);//�б� ��� �Ҽ� ��°�ڸ����� ���.
		}

	}

	@Override
	public void showTotAvg() {//����� ��� �޼ҵ�
		System.out.printf("�����= %.2f \n",avgtotal/semester);
		//addSemester �޼ҵ忡�� ���� avgtotal�� �б� ���� ������. �Ҽ� ��°�ڸ����� ���
	}

	@Override
	public int getSemester() {//�б�� ����
		return semester;
	}

}
