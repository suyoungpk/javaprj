package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
	 static void printSumAvg(int sum,double count) {
		double avg = sum/count;
		System.out.printf("sum:%d\r\n",sum);
		System.out.printf("avg:%f",avg);
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; arr[i] != -1; i++) sum += arr[i];
		return sum;
	}
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
		int sum = sum(nums);
//		������ ���
		//double avg = sum/count;
		printSumAvg(sum,count);
//		System.out.printf("sum:%d",sum);
//		System.out.printf("avg:%f",avg);
		
	}
	
}
