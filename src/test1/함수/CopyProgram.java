package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		FileOutputStream fout = new FileOutputStream("src/res/image1.bmp");
		
		// �а� ���� �ʹ� ������. �׷���  ū ���𰡰� �ʿ��ϴ�
		byte[] buf = new byte[1024]; // 1024 : 1kb
		int size = 0;
		while (size != -1) {
			size = fin.read(buf);
			fout.write(buf,0,size);
		}
		
		fin.close();
		fout.close();
		System.out.println("����Ϸ�");
	}
}
