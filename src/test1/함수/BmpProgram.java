package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		byte[] buf = new byte[10];
		fin.read(buf);
		// 1byte는 8bit니까 비트연산을 하면서 값들은 한번에 담기 위해 자리를 만들어줌
		int size = ((int)buf[2]&0xff) << 0 | // int는 4바이트(32bit)
				   ((int)buf[3]&0xff) << 8 |// 앞에 1자리
				   ((int)buf[4]&0xff) << 16 |// 앞에 2자리
				   ((int)buf[5]&0xff) << 24;// 앞에 3자리 // 32비트자리가 만들어짐
					//0000 0000(2진)  >  0X00(16진) 0x(16진수의 기호) + 0하나에 0000
					// (int)buf[2] & 0x 00 00 00 ff  
					// (int)buf[3] & 0x 00 00 00 ff 00 00 00 00
					// (int)buf[4] & 0x 00 00 00 ff 00 00 00 00 00 00 00 00
					// (int)buf[5] & 0x 00 00 00 ff 00 00 00 00 00 00 00 00 00 00 00 00
				   //cpu 처리 방식이 두가지가 있는 데 lisc 물리적(속도빠름,비쌈), cisc(저가형-가정용) 
				   //cisc방식이라할지라도 저장은 lisc로 하기 위해 방 맨 뒤에있는 자료를 앞으로 보냄 
				   //그래서 >> 가 아니라 <<로 해야함.
				   //shift 연산 후 앞자리가 1인 값은 앞의 메모리에 1이 기본으로 채워진다.
				   //마스크처리로  자동으로 1로 채워지는 동작을 방지한다 (0으로 지워냄)
				   // x = 10(10진수); x=012(8진수), X = 0x 0000000A(16진수), X=0b 0000 0000 0000 0000 0000 0000 0000 1010(2진수);
				   // 1111 > f , 1010 > A 
				   // Mask 처리 할 부분은 0인자로, 보존할 부분의 값을 1로 해서 &연산하여 0으로 가려준다.
				   
		System.out.println(size);
		fin.close();
		
	}
}
