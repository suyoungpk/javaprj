package test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException {
		//System.out
		FileOutputStream fout = new FileOutputStream("src/res/test.txt");
		fout.write('1');// 바이너리로 저장된 파일이 더 가볍다
		fout.write('2');
		fout.flush();
		
		fout.close();
//		System.out.write('2'+1);// '2'의 아스키값 50에 1을 더해서 51의 아스키값 출력
//		System.out.println();
//		System.out.write(51);
//		System.out.flush();
//		//1. 파일 입력 스트림 fin 객체를 생성할 것
//		FileInputStream fin = new FileInputStream("src/res/image.bmp");
//		//절대경로 : 디스크 루트부터
//		//상대경로 : classpath 시작 기준점은 프로젝스폴더 부터.
//		// 2. 파일에서 첫번 째 1바이트를 읽어서 출력할 것.
//			System.out.println(fin.read());
//		//3. 파일 입력 스트림을 닫을 것.
//			fin.close();
	}
}
