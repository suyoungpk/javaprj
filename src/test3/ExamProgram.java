package test3;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		// 클래스로 데이터 구조를 쓰는 경우
		Exam exam = new Exam();
		// 생성자를 정의하지 않은 상태에서는 자동생성된다 그러나 매개변수를 넣는 생성자를 만들 경우 앞에 정의된 것이 없기 때문에 
		// 오류가 난다. 그래서 기본적으로 정의해주는 것이 좋다.
		
		Exam exam2 = new Exam(10,30,20);//객체 생성
//		System.out.println(Exam.type);
//		System.out.println(exam.science);
		//1. 성적을 입력
		//exam.input();
		//Exam.input(exam);
		//2. 성적을 출력
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
