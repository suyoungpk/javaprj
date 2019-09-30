package test1.함수;

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
		// 배열의 정적인 (항상 여유분의 공간을 미리 만들어야 오류가 없는)단점을 보완한 것이 컬렉션
		int[] nums = new int[100];
		// 데이터 일괄 로드
		for (int i = 0;fscan.hasNext(); i++) {
			nums[i] = fscan.nextInt();
			nums[i+1] = -1;
		}
		fin.close();
	    //데이터를 한번에 불러와서 닫고 저장한 데이터로 연산하는 것이 속도면에서 더 빠르다.
//		데이터개수
		double count = 0;
		for (int i = 0; nums[i] != -1; i++) count++;
//		데이터 합
		int sum = sum(nums);
//		데이터 평균
		//double avg = sum/count;
		printSumAvg(sum,count);
//		System.out.printf("sum:%d",sum);
//		System.out.printf("avg:%f",avg);
		
	}
	
}
