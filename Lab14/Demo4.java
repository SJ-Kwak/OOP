import java.io.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//���Ϸκ��� ���� �Է� ��Ʈ�� ����
			FileReader in=new FileReader("c:\\Temp\\test.txt");
			int c;
			while((c=in.read())!=-1) {//�� ���ھ� �д´�
				System.out.println((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
