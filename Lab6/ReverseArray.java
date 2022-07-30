import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();//·£´ý °´Ã¼ »ý¼º
		Scanner stdIn = new Scanner(System.in);//½ºÄ³³Ê °´Ã¼ »ý¼º
		
		System.out.print("¿ä¼Ò ¼ö: ");
		int n = stdIn.nextInt();//¿ä¼Ò ¼ö ÀÔ·Â
		int[] a = new int[n];//¹è¿­ ¼±¾ð
		
		for(int i=0;i<n;i++) {
			a[i]=10+rand.nextInt(90);//0ÀÌ»ó 90¹Ì¸¸ÀÇ ³­¼ö ¹ß»ý+10À» ´õÇØ 1~100±îÁöÀÇ ³­¼ö ¼³Á¤
			//¹è¿­ ¿ø¼Ò¿¡ »ç¿ëÀÚ ÀÔ·Â µ¥ÀÌÅÍ¸¸Å­ÀÇ Á¤¼ö¸¦ ·£´ýÇÏ°Ô ¹ß»ý½ÃÅ´
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		for(int i=0;i<n/2;i++) {//¿ª¼øÀ¸·Î ¹Ù²Ù±â. n/2¸¸Å­¸¸ ¹Ýº¹
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
		System.out.println("¿ä¼Ò¸¦ ¿ª¼øÀ¸·Î ­‹·Â");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		stdIn.close();

	}

}
