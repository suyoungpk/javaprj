package test3;

import java.util.Scanner;

public class Exam {
	int kor, eng, math;
//	int science = 5;
//	static int type=3;
	public Exam(){
		this(0,0,0);
	}
	public Exam(int kor, int eng, int math){
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		//science = 10;
	}
	public void input() {
		System.out.print("I국어점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
	}
	public static void input(Exam ex) {
		System.out.print("S국어점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		ex.kor = sc.nextInt();
	}
	public void print() {
		System.out.println("국어점수는: "+ kor+"점 입니다");
	}
	public static void print(Exam ex) {
		System.out.println("국어점수는: "+ ex.kor+"점 입니다");
	}
	public int total() {
		return kor+eng+math;
	}
}


