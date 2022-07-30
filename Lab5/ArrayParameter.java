//라이브러리 클래스
public class ArrayParameter {
	static void replaceSpace(char a[]) {//정적 메소드. 클래스 로딩 끝난 이후부터 바로 사용. 
		//메모리 할당 한 번만 이루어짐. 메모리 사용 효율적. 과도하게 사용하면 불필요한 메모리 사용.
		for(int i=0;i<a.length;i++)
			if(a[i] == ' ')
				a[i] = ','; //공백 문자를 , 로 변경
	}
	
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]); //배열 원소 문자 춮력
		System.out.println(); //배열 원소 모두 출력 후 줄바꿈
	}

}
