//package game;
//
//import java.awt.Canvas;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;
//import java.util.Random;
//
//public class PuzzleCanvas2 extends Canvas {
//	private Puzzle puzzle;
//	private int[] pos={0,1,2,3,4,5,6,7,8};
//	public PuzzleCanvas2() {		
//		Random ran = new Random();
//		for (int i = 0; i < 10; i++) {
//			int p1 = ran.nextInt(9);
//			int p2 = ran.nextInt(9);
//			//System.out.printf("[p1 : %d],[p2 : %d]\r\n ",p1,p2);
//			int temp;
//			temp = pos[p1];
//			pos[p1] = pos[p2];
//			pos[p2] = temp;
//		}
//		
//		PuzzleContext.setCanvas(this); // ĵ������ü ����
//		puzzle = new Puzzle(2);	// �־��� ���ڹ�°�� ���� ����	
//	}
//	
//	@Override
//	public void paint(Graphics g) {
//		puzzle.paint(g);
//	}
//}
