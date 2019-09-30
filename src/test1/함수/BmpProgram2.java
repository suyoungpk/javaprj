package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		byte[] buf = new byte[26];
		fin.read(buf);
		// 1byte는 8bit니까 비트연산을 하면서 값들은 한번에 담기 위해 자리를 만들어줌
		int width = ((int)buf[18]&0xff) << 0 | // int는 4바이트(32bit)
				   ((int)buf[19]&0xff) << 8 |// 앞에 1자리
				   ((int)buf[20]&0xff) << 16 |// 앞에 2자리
				   ((int)buf[21]&0xff) << 24;// 앞에 3자리 // 32비트자리가 만들어짐
		
		int height = ((int)buf[22]&0xff) << 0 | // int는 4바이트(32bit)
				   ((int)buf[23]&0xff) << 8 |// 앞에 1자리
				   ((int)buf[24]&0xff) << 16 |// 앞에 2자리
				   ((int)buf[25]&0xff) << 24;// 앞에 3자리 // 32비트자리가 만들어짐
		System.out.println("width : "+width+", height : "+height); // int로 907 정보가 나오는데.. 
		fin.close();
		
	}
}
