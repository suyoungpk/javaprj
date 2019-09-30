package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		byte[] buf = new byte[26];
		fin.read(buf);
		// 1byte�� 8bit�ϱ� ��Ʈ������ �ϸ鼭 ������ �ѹ��� ��� ���� �ڸ��� �������
		int width = ((int)buf[18]&0xff) << 0 | // int�� 4����Ʈ(32bit)
				   ((int)buf[19]&0xff) << 8 |// �տ� 1�ڸ�
				   ((int)buf[20]&0xff) << 16 |// �տ� 2�ڸ�
				   ((int)buf[21]&0xff) << 24;// �տ� 3�ڸ� // 32��Ʈ�ڸ��� �������
		
		int height = ((int)buf[22]&0xff) << 0 | // int�� 4����Ʈ(32bit)
				   ((int)buf[23]&0xff) << 8 |// �տ� 1�ڸ�
				   ((int)buf[24]&0xff) << 16 |// �տ� 2�ڸ�
				   ((int)buf[25]&0xff) << 24;// �տ� 3�ڸ� // 32��Ʈ�ڸ��� �������
		System.out.println("width : "+width+", height : "+height); // int�� 907 ������ �����µ�.. 
		fin.close();
		
	}
}
