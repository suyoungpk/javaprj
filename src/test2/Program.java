package test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException {
		//System.out
		FileOutputStream fout = new FileOutputStream("src/res/test.txt");
		fout.write('1');// ���̳ʸ��� ����� ������ �� ������
		fout.write('2');
		fout.flush();
		
		fout.close();
//		System.out.write('2'+1);// '2'�� �ƽ�Ű�� 50�� 1�� ���ؼ� 51�� �ƽ�Ű�� ���
//		System.out.println();
//		System.out.write(51);
//		System.out.flush();
//		//1. ���� �Է� ��Ʈ�� fin ��ü�� ������ ��
//		FileInputStream fin = new FileInputStream("src/res/image.bmp");
//		//������ : ��ũ ��Ʈ����
//		//����� : classpath ���� �������� ������������ ����.
//		// 2. ���Ͽ��� ù�� ° 1����Ʈ�� �о ����� ��.
//			System.out.println(fin.read());
//		//3. ���� �Է� ��Ʈ���� ���� ��.
//			fin.close();
	}
}
