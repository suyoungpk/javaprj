package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		int[] nums = new int[10];
		//InputStream / OutputStream
		//��� + ����(OI)[�ܼ�, ����, UI������(��,������,3D)]

		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\JavaPrj\\src\\res\\data.txt");
		//System.out.println(fin.read()); >> �ڷᰡ ������ 1����Ʈ�� �ҷ�����
		//�׷��� ��ĳ�� Ȱ��
		Scanner fscan = new Scanner(fin);
		int num = 0;
		float cnt = 0;
		int sum = 0;
		float avg = 0;
		
		//���ۿ� �ӹ� ���ڿ��� �����͵��� �����ö� �ڷ��� ���� �ϱ�
		while (fscan.hasNext()) { // ���� �ڷᰡ �ִ��� �Ǵ��ؼ� boolean������ �����Ͷ�
			num = fscan.nextInt(); 
			// ���� �ڷᰪ�� �����̽��������� �и��ǰ� �ױ������� �ڷ�ã�� ���ƴٴϱ⶧���� �������� �Էµ� ù �ڷᰪ�� ��� 
			sum += num;
			//System.out.println(num);
			cnt++;
		}
		avg = sum/cnt;
		System.out.println("�հ� : "+sum+", ��� : "+avg);
		fin.close(); fscan.close();
	}
}
