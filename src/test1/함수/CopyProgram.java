package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		FileOutputStream fout = new FileOutputStream("src/res/image1.bmp");
		
		// 읽고 쓰고 너무 느리다. 그래서  큰 무언가가 필요하다
		byte[] buf = new byte[1024]; // 1024 : 1kb
		int size = 0;
		while (size != -1) {
			size = fin.read(buf);
			fout.write(buf,0,size);
		}
		
		fin.close();
		fout.close();
		System.out.println("복사완료");
	}
}
