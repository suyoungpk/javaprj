package test4;

import java.util.Scanner;

public class WrapperTest2 {
	public static void main(String[] args) {
//		System.out.print("���������Է� : ");
//		Scanner sc1 = new Scanner(System.in);
//		String kor_ = sc1.next();
//		
//		System.out.print("���������Է� : ");
//		Scanner sc2 = new Scanner(System.in);
//		String eng_ = sc2.next();
//		
//		System.out.print("���������Է� : ");
//		Scanner sc3 = new Scanner(System.in);
//		String math_ = sc3.next();
//		
//		int kor = Integer.parseInt(kor_);
//		int eng = Integer.parseInt(eng_);
//		int math = Integer.parseInt(math_);
//		
//		int total = kor+eng+math;
//		System.out.printf("total : %d\n",total);
		String name1 = "������";
		String name2 = new String("������");
		//System.out.println(name1 == name2);
		//System.out.println(name1.equals(name2));
//		System.out.println(name1 == "������");
//		-------------------------
//		Integer s = 1;
//		int j = 1;
		
//		System.out.println(s == j);
		String fileName = "photo123456.jpg";
//		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.substring(0, fileName.indexOf(".")));
		
		String str = fileName.replace("o", "x");
		System.out.println(str);
		
	}
}
