//2���� �迭�� �г⺰�� 1,2�б� ������ �����ϰ�, 4�Ⱓ ��ü ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.5,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum=0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term];
		
		System.out.printf("���� ���: %.2f", sum/(score.length*score[0].length));
		//score.length �迭�� �� ����, score[0].length �迭�� 0��° ���� �� ����. ������ �迭�̱� ������ �ƹ� ���̳� ���� ����
				

	}

}
