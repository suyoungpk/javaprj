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
		//최초 실행시에 시스템의 입력버퍼에 아무것도 없기때문에 사용자에게 값을 입력받는 프롬프트가 실행된다.
		System.out.println(b1); // 받은 입력값의 1바이트만 가져와서 아스키코드값으로 출력.
	
		int b2 = fin.read(); //파일내부의 내용을 읽어서 1바이트만 가져옴
		System.out.println(b2);//아스키값 출력.
		
		int kor = 80;
		int eng = 90;
		//System.out; // System 클래스 안에 PrintStream out 변수로 존재
//		System.out.write('H'); //출력버퍼에 담아줌
//		System.out.write('E'); //출력버퍼에 담아줌
//		System.out.write('L'); //출력버퍼에 담아줌
//		System.out.write('L'); //출력버퍼에 담아줌
//		System.out.write('O'); //출력버퍼에 담아줌
//		System.out.flush();// 콘솔에 출력해라 
		
		System.out.printf("kor:%d, eng:%d\r\n",kor,eng);
//		System.out.print("\r\n");
		System.out.print("end");
		
		FileOutputStream fos = new FileOutputStream("src/res/api-out.txt");
		PrintStream fout = new PrintStream(fos);
//		fout.print("hello");
		fout.printf("kor : %d, eng:%d\r\n",kor,eng);
//		fout.print("\r\n");
		fout.print("end");
		// PrintStream 클래스 내에 print메서드에서 flush기능까지 포함하니 간편하게 쓸 수 있다.
		fout.close();
		fin.close();
		
	}

}
