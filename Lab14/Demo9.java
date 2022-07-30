import java.io.*;
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		try {
			BufferedReader rd=new BufferedReader(new InputStreamReader(new FileInputStream("c:\\Temp\\infile1.txt"),"UTF8"));
			FileWriter w=new FileWriter("c:\\Temp\\result1.txt");
			
			while((s=rd.readLine())!=null) {
				w.write(s+"\r\n");
			}
			rd.close();
			w.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
