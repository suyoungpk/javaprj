package test4;

import test3.Exam;

public class WrapperTest {
	public static void main(String[] args) {
		int x =3;
		float y=3.5f;
		char c = 'a';
		double d = 4.7;
		Exam r = new Exam();
		
		//Boxing �۾�  jdk9 �̻���ʹ� �̷�������� ���Ұŷ�
//		Object[] data = new Object[10];
//		data[0] = new Integer(x);
//		data[1] = new Float(y);
//		data[2] = new Character(c);
//		data[3] = new Double(d);
//		data[4] = r;
		
		//Auto Boxing
//		Object[] data = new Object[10];
//		data[0] = x;
//		data[1] = y;
//		data[2] = c;
//		data[3] = d;
//		data[4] = r;
		
		//Boxing  ������ �����ϴ� ����� ���� ����
		Object[] data = new Object[10];
		data[0] = Integer.valueOf(x);
		data[1] = Float.valueOf(y);
		data[2] = Character.valueOf(c);
		data[3] = Double.valueOf(d);
		data[4] = r;
		
		String s = new String("hello");
		s.length();
		int ss = "hello".length();
		
		String s1 = "hello ";
		String s2 = "Okay";
		String s3 = s1 + s2; 
		// +�� �����ڰ� �ƴ϶� '+'�� ��ȣ�� �ϴ� �Լ��̴�. c++���� '+'����� �Լ��� �������̵��ؼ� ����� �� ������ �ڹٿ����� ��� �Ұ�
		
		
		int n = 3;
		//String s = n;
		String str = Integer.toString(n);// ���ڸ� ���ڿ��� 
		//String str = String.valueOf(n);

		//String str = "35"; // int x = Integer.parseInt(s);
		//int n = str
	}
}
