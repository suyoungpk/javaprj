package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		int[] nums = new int[10];
		//InputStream / OutputStream
		//언어 + 도구(OI)[콘솔, 파일, UI껍데기(웹,윈도우,3D)]

		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\JavaPrj\\src\\res\\data.txt");
		//System.out.println(fin.read()); >> 자료가 많은데 1바이트만 불러와짐
		//그래서 스캐너 활용
		Scanner fscan = new Scanner(fin);
		int num = 0;
		float cnt = 0;
		int sum = 0;
		float avg = 0;
		
		//버퍼에 머문 문자열의 데이터들을 가져올때 자료형 변형 하기
		while (fscan.hasNext()) { // 다음 자료가 있는지 판단해서 boolean값으로 가져와라
			num = fscan.nextInt(); 
			// 다음 자료값을 스페이스공간으로 분리되고 그기준으로 자료찾아 돌아다니기때문에 공간없이 입력된 첫 자료값의 경우 
			sum += num;
			//System.out.println(num);
			cnt++;
		}
		avg = sum/cnt;
		System.out.println("합계 : "+sum+", 평균 : "+avg);
		fin.close(); fscan.close();
	}
}
