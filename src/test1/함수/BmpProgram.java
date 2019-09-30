package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		byte[] buf = new byte[10];
		fin.read(buf);
		// 1byte�� 8bit�ϱ� ��Ʈ������ �ϸ鼭 ������ �ѹ��� ��� ���� �ڸ��� �������
		int size = ((int)buf[2]&0xff) << 0 | // int�� 4����Ʈ(32bit)
				   ((int)buf[3]&0xff) << 8 |// �տ� 1�ڸ�
				   ((int)buf[4]&0xff) << 16 |// �տ� 2�ڸ�
				   ((int)buf[5]&0xff) << 24;// �տ� 3�ڸ� // 32��Ʈ�ڸ��� �������
					//0000 0000(2��)  >  0X00(16��) 0x(16������ ��ȣ) + 0�ϳ��� 0000
					// (int)buf[2] & 0x 00 00 00 ff  
					// (int)buf[3] & 0x 00 00 00 ff 00 00 00 00
					// (int)buf[4] & 0x 00 00 00 ff 00 00 00 00 00 00 00 00
					// (int)buf[5] & 0x 00 00 00 ff 00 00 00 00 00 00 00 00 00 00 00 00
				   //cpu ó�� ����� �ΰ����� �ִ� �� lisc ������(�ӵ�����,���), cisc(������-������) 
				   //cisc����̶������� ������ lisc�� �ϱ� ���� �� �� �ڿ��ִ� �ڷḦ ������ ���� 
				   //�׷��� >> �� �ƴ϶� <<�� �ؾ���.
				   //shift ���� �� ���ڸ��� 1�� ���� ���� �޸𸮿� 1�� �⺻���� ä������.
				   //����ũó����  �ڵ����� 1�� ä������ ������ �����Ѵ� (0���� ������)
				   // x = 10(10����); x=012(8����), X = 0x 0000000A(16����), X=0b 0000 0000 0000 0000 0000 0000 0000 1010(2����);
				   // 1111 > f , 1010 > A 
				   // Mask ó�� �� �κ��� 0���ڷ�, ������ �κ��� ���� 1�� �ؼ� &�����Ͽ� 0���� �����ش�.
				   
		System.out.println(size);
		fin.close();
		
	}
}
