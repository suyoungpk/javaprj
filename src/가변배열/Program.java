package 가변배열;

import test3.Exam;

public class Program {
//	public static int cnt;
//	static {
//		cnt = 0;
//	}
	public static void main(String[] args) {
		//ObjectList list = new ObjectList();
		GList<Exam> list = new GList(); // 배열을 위한 템플릿용 클래스 
		//list.add("hello");
		//list.add(30);
		list.add(new Exam());
		
		//list.get(2).input();
		list.get(2).input();
		list.get(2).print();
		//Object[] data = new Object[3];
//		ObjectList list = new ObjectList();
//		int exit = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		do {
////			input(data);
////			print(data);
//			input(list);
//			print(list);
//			System.out.print("go?(1 or 0):");
//			exit = sc.nextInt();
//		} while (exit != 1);
//	}	
//	public static void input(ObjectList data) {
//		System.out.print("kor :");
//		Scanner sc = new Scanner(System.in);
//		//int kor_input = sc.nextInt();
//		data.add(sc.nextInt());
////		data[cnt] = kor_input;
////		cnt++;	
//		//System.out.println(cnt);
//	}
//	public static void print(ObjectList data) {
//		for (int i = 0; i < data.size(); i++) {
//			System.out.print(data.get(i)+", ");
//		}
	}
}
