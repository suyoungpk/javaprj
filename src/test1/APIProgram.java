package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {

	public static void main(String[] args) throws IOException {
		//System.in
		FileInputStream fin = new FileInputStream("src/res/data.txt");
		
		int b1 = System.in.read();
		//���� ����ÿ� �ý����� �Է¹��ۿ� �ƹ��͵� ���⶧���� ����ڿ��� ���� �Է¹޴� ������Ʈ�� ����ȴ�.
		System.out.println(b1); // ���� �Է°��� 1����Ʈ�� �����ͼ� �ƽ�Ű�ڵ尪���� ���.
	
		int b2 = fin.read(); //���ϳ����� ������ �о 1����Ʈ�� ������
		System.out.println(b2);//�ƽ�Ű�� ���.
		
		int kor = 80;
		int eng = 90;
		//System.out; // System Ŭ���� �ȿ� PrintStream out ������ ����
//		System.out.write('H'); //��¹��ۿ� �����
//		System.out.write('E'); //��¹��ۿ� �����
//		System.out.write('L'); //��¹��ۿ� �����
//		System.out.write('L'); //��¹��ۿ� �����
//		System.out.write('O'); //��¹��ۿ� �����
//		System.out.flush();// �ֿܼ� ����ض� 
		
		System.out.printf("kor:%d, eng:%d\r\n",kor,eng);
//		System.out.print("\r\n");
		System.out.print("end");
		
		FileOutputStream fos = new FileOutputStream("src/res/api-out.txt");
		PrintStream fout = new PrintStream(fos);
//		fout.print("hello");
		fout.printf("kor : %d, eng:%d\r\n",kor,eng);
//		fout.print("\r\n");
		fout.print("end");
		// PrintStream Ŭ���� ���� print�޼��忡�� flush��ɱ��� �����ϴ� �����ϰ� �� �� �ִ�.
		fout.close();
		fin.close();
		
	}

}
