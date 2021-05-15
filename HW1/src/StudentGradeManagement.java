/*hw1 2076016 ������*/

import java.util.InputMismatchException; //exception file import
import java.util.Scanner; //scanner ��ü ����
public class StudentGradeManagement {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //��ĳ�� ��ü�� ���� �Է°� ����
		int num=0;//�л� �� ���� ���� �� �ʱ�ȭ
		int sel=0;//1~5������ ���� ���� ����
		int score[]=null; //���� �迭 ���� �� null������ �ʱ�ȭ
		int i;//index���� i ����
		
			do {//do~while ���� ���� ��¹� �ݺ��ǰ� ��.
				try {//try~catch������ ���� ���� ������� �Է¹ް� ��.
					System.out.println("--------------------------------------------------------------");
					System.out.println(">>1. �л��� �Է� >>2. ���� �Է� >>3. ���� ����Ʈ >>4. ���� �м� >.5. ����");
					System.out.println("--------------------------------------------------------------");
					System.out.print("����>");
					try {//try ~ catch���� ���� ���� ó��
						sel=s.nextInt();//��ĳ�� ��ü�� ���� ���� ���� �Է�.
					}
					catch(InputMismatchException e) {//������ �ƴ� ������ �Է� ��, ���� ó��
						System.out.println("������ �ƴմϴ�. 1���� 5������ ������ ������� �������ּ���.");
						s.nextLine();//���� �Է½�Ʈ���� �����ִ� ��ū�� ����. ���� �Է� ��, ���� �߻��̴ϱ� �߸� �Էµ� ���ڿ��� �����.
						continue;//�ٽ� ���� ���� �Է� ������ ����
					}
					switch(sel) {//���� ���� sel�� ���� switch��
					case 1://sel���� 1�� ���
						System.out.print("�л����� �Է��� �ּ���!> ");
						try {
							num=s.nextInt();//��ĳ�� ��ü�� ���� �л� �� �Է�
							if(num==0) {
								System.out.println("0�� �ƴ� ������ �Է����ּ���.");//���� ���� 0 �Է� ��, ���Է¹ޱ�
								s.nextLine();
								System.out.print("�л����� �Է��� �ּ���!> ");//���� �Է� ��, �л� �� �ٽ� �Է� ����
								num=s.nextInt();
							}
						}
						catch(InputMismatchException e) {//������ �ƴ� ������ �Է� ��, ���� ó��
							System.out.println("������ �ƴմϴ�.");
							s.nextLine();
							System.out.print("�л����� �Է��� �ּ���!> ");//���� �Է� ��, �л� �� �ٽ� �Է� ����
							num=s.nextInt();
						}												
						score=new int[num];//������ score �迭 ����
						break;
					case 2://sel���� 2�� ���
						for(i=0;i<score.length;i++) {//i�� score�迭�� ���̺��� ���� ��
							try {
								System.out.println("������ �Է��� �ּ���!> ");
								System.out.print(i+1+"�� �л�> ");//i�� 0���� �����߱� ������ i+1��° �л����� ǥ��
								score[i]=s.nextInt();//�迭�� �� ���ҿ� �Է°� ����.
								if(score[i]>100 || score[i]<0) {//�Էµ� �������� 0�� 100���̿� ���� ��
									System.out.println("0���� 100 �ȿ����� �Է��ϼ���");
									s.nextLine();//���ڿ� �Է¹��� �� �����
									i--;//�ε��� i���� �������� �ʵ��� �̸� ����
								}
							}
							catch(InputMismatchException e) {
								System.out.println("������ �ƴմϴ�.");//������ �ƴ� ������ �Է� ��, ���� ó��
								s.nextLine();//���ڿ� �Է¹��� �� �����
								i--;//i�� �������� �ʵ��� �̸� ����
								continue;//�ٽ� for������ �б�. ���� �Է� ������ ����.
							}
						}
						break;
					case 3://sel���� 3�� ���
						for(i=0;i<score.length;i++) {//�迭�� 0��° ���Һ��� ���ʴ��
							System.out.println(i+1+"�� �л�: "+score[i]+"��");//i+1��° �л��� ���� ���.
							for(int j=0;j<score[i];j++)//�迭�� 0��° ���Һ��� ���ʴ��. j���� �迭 ������ ���Ұ����� ���� ��
								System.out.print("*");//�迭�� �� ���Ұ���ŭ *���
							System.out.println();//��� �� �ٹٲ�
						}
						break;
					case 4:
						int max=score[0];//�迭 0��° ���Ұ����� �ʱ�ȭ
						double sum=0.0;//�Ǽ��� ���� ���� �� �ʱ�ȭ
						for(i=0;i<score.length;i++) {
							if(score[i]>max)//�迭�� ���Ұ��� max���� Ŭ ��. �̶� ó�� ����Ǿ��ִ� max�� �迭�� 0��° ���Ұ�
								max=score[i];//�ִ밪 ���ϱ�
							sum+=score[i];//�迭 ������ �� ���ϱ�
						}
						System.out.println("�ְ� ����: "+max);
						System.out.printf("��� ����: %.2f", sum/score.length);//�Ҽ� ��°�ڸ����� ���. �迭 ������ ��/�迭�� ����=>���
						System.out.println();
						
						for(i=0;i<score.length;i++) {
							char grade;//������ ���� ������ ������ ������ ���� grade ����
							grade=(score[i]>=90)?'A':((score[i]>=80)?'B':((score[i]>=70)?'C':(score[i]>=60)?'D':'F'));
							//���� ������ �̿��Ͽ� ������ ���� ���� �ο�
							System.out.println(i+1+"�� �л�: "+score[i]+" "+grade+"����");
						}
						break;
					case 5:
						System.out.println("���α׷� �����մϴ�! ������ �� �̿����ּ���! Good Bye!!");
						break;
					default://1~5�� �ƴ� �ٸ� �� �Է� ��, ���Է¹���
						System.out.println("1~5 ������ �������� �����ϼ���.");
						continue;
					}
				}
				catch(NullPointerException e) {//1���� 5���� ������� �������� ������ score�迭�� null ���۷����� ������ ä�� �۾� ����. ���� ó��
					System.out.println("1���� 5���� ������� �����ϼ���.");//������� �Է��ϰ� ��
					continue;//�ٽ� ���� ���� �Է¹����� ���ư�
				}
			}while(sel!=5);//�۾��� ���� �� sel���� 5�� �ƴ� ���, �� ���� 5���� ���� ������ ���, �ݺ��� ���� 
		s.close();//��ĳ�� ��ü ����
	}
}
