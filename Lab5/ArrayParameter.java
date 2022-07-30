//¶óÀÌºê·¯¸® Å¬·¡½º
public class ArrayParameter {
	static void replaceSpace(char a[]) {//Á¤Àû ¸Ş¼Òµå. Å¬·¡½º ·Îµù ³¡³­ ÀÌÈÄºÎÅÍ ¹Ù·Î »ç¿ë. 
		//¸Ş¸ğ¸® ÇÒ´ç ÇÑ ¹ø¸¸ ÀÌ·ç¾îÁü. ¸Ş¸ğ¸® »ç¿ë È¿À²Àû. °úµµÇÏ°Ô »ç¿ëÇÏ¸é ºÒÇÊ¿äÇÑ ¸Ş¸ğ¸® »ç¿ë.
		for(int i=0;i<a.length;i++)
			if(a[i] == ' ')
				a[i] = ','; //°ø¹é ¹®ÀÚ¸¦ , ·Î º¯°æ
	}
	
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]); //¹è¿­ ¿ø¼Ò ¹®ÀÚ ­‹·Â
		System.out.println(); //¹è¿­ ¿ø¼Ò ¸ğµÎ Ãâ·Â ÈÄ ÁÙ¹Ù²Ş
	}

}
