package test1.�Լ�;

import java.util.Scanner;

public class LottoProgram {
	public static void main(String[] args) {
		//������
		int[] lotto = new int[6];
		//���(�˰���)
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
		
		System.out.println("���� �ζ� �Է±��Դϴ�");
		System.out.println("1���� 45������ ���� �� 6���� ���ڸ� ����ּ���.");
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i+1+"��° ��ȣ�� �Է����ּ��� :");
			Scanner sc = new Scanner(System.in);
			lotto[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					System.out.println("�ߺ��� �����Դϴ�. �ٽ� �Է����ּ���.");
					i--;
					break;
				}
			}	
			System.out.print(lotto[i] + ", ");
		}
		
	}

	private static int inputMenu() {
		System.out.print("�޴���ȣ �Է� : ");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 //System.out.println(num);
		return num;
	}

	private static void printMenu() {
		System.out.println("---------->> �޴��� �����ϼ��� <<-------");
		System.out.println("1. ����");
		System.out.println("2. �ڵ�");
		System.out.println("3. ����");
		System.out.println("-----------------------------------");		
	}
}
