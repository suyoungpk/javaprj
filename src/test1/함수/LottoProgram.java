package test1.함수;

import java.util.Scanner;

public class LottoProgram {
	public static void main(String[] args) {
		//데이터
		int[] lotto = new int[6];
		//기능(알고리즘)
		printMenu();
		switch (inputMenu()) {
		case 1:
			inputLottoManual(lotto);
			break;
		case 2:
			genLottoAuto(lotto);
			break;
		case 3:
			exitProgram();
			break;
		default:
			errorMessage();
			break;
		}
	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void genLottoAuto(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static void inputLottoManual(int[] lotto) {
		
		System.out.println("수동 로또 입력기입니다");
		System.out.println("1부터 45까지의 숫자 중 6개의 숫자를 골라주세요.");
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i+1+"번째 번호를 입력해주세요 :");
			Scanner sc = new Scanner(System.in);
			lotto[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					System.out.println("중복된 숫자입니다. 다시 입력해주세요.");
					i--;
					break;
				}
			}	
			System.out.print(lotto[i] + ", ");
		}
		
	}

	private static int inputMenu() {
		System.out.print("메뉴번호 입력 : ");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 //System.out.println(num);
		return num;
	}

	private static void printMenu() {
		System.out.println("---------->> 메뉴를 선택하세요 <<-------");
		System.out.println("1. 수동");
		System.out.println("2. 자동");
		System.out.println("3. 종료");
		System.out.println("-----------------------------------");		
	}
}
