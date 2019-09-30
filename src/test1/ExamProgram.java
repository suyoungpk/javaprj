package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/res/data.txt");
		Scanner fscan = new Scanner(fin);
		// �迭�� ������ (�׻� �������� ������ �̸� ������ ������ ����)������ ������ ���� �÷���
		int[] nums = new int[100];
		// ������ �ϰ� �ε�
		for (int i = 0;fscan.hasNext(); i++) {
			nums[i] = fscan.nextInt();
			nums[i+1] = -1;
		}
		fin.close();
	    //�����͸� �ѹ��� �ҷ��ͼ� �ݰ� ������ �����ͷ� �����ϴ� ���� �ӵ��鿡�� �� ������.
//		�����Ͱ���
		double count = 0;
		for (int i = 0; nums[i] != -1; i++) count++;
//		������ ��
		int sum = 0;
		for (int i = 0; nums[i] != -1; i++) sum += nums[i];
//		������ ���
		double avg = sum/count;
		
		System.out.printf("sum:%d",sum);
		System.out.printf("avg:%f",avg);
		
	}
}
