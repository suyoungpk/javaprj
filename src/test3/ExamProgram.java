package test3;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		// Ŭ������ ������ ������ ���� ���
		Exam exam = new Exam();
		// �����ڸ� �������� ���� ���¿����� �ڵ������ȴ� �׷��� �Ű������� �ִ� �����ڸ� ���� ��� �տ� ���ǵ� ���� ���� ������ 
		// ������ ����. �׷��� �⺻������ �������ִ� ���� ����.
		
		Exam exam2 = new Exam(10,30,20);//��ü ����
//		System.out.println(Exam.type);
//		System.out.println(exam.science);
		//1. ������ �Է�
		//exam.input();
		//Exam.input(exam);
		//2. ������ ���
		//Exam.print(exam);
		//exam.print();
		
		NewLec a = new NewLec(1,1,1,1);
		Exam b = new NewLec(1,1,1,1);
		
		System.out.println(a.total());
		System.out.println(b.total());
		
//		System.out.println(a.com);
//		System.out.println(b.com); // 
		
	}
}
