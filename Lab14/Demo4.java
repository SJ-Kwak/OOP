import java.io.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일로부터 문자 입력 스트림 생성
			FileReader in=new FileReader("c:\\Temp\\test.txt");
			int c;
			while((c=in.read())!=-1) {//한 문자씩 읽는다
				System.out.println((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
