package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas extends Canvas {
	int[] pos={0,1,2,3,4,5,6,7,8};
	public PuzzleCanvas() {
		// * 값 바꾸기
//		1. 임시 변수 temp 선언
//		2. 1번째 방의 값을 temp로 옮긴다
//		3. 3번째 방의 값을 1번째 방으로 옮긴다
//		4. 임시변수값을 3번째 방으로 옮긴다.
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int p1 = ran.nextInt(9);
			int p2 = ran.nextInt(9);
			//System.out.printf("[p1 : %d],[p2 : %d]\r\n ",p1,p2);
			int temp;
			temp = pos[p1];
			pos[p1] = pos[p2];
			pos[p2] = temp;
		}
//		for (int i = 0; i < pos.length; i++) {
//			System.out.printf("[%d] ",pos[i]);
//		}
	}
	
	@Override
	public void paint(Graphics g) {
		
//		Toolkit tk = Toolkit.getDefaultToolkit();// static 함수~
//		Image img = tk.getImage("src/res/ground.jpg");	
		
//		int w = 200;
//		int h = 200;
//		int gap = 5;
		for (int i = 0; i < pos.length; i++) {
			
			Puzzle puzzle = new Puzzle();			
			puzzle.setPos(i);
			
//			int x = (i%3)*(w+gap);
//			int y = (i/3)*(h+gap);
			
			puzzle.setSrc(pos[i]);
			
//			int sx = (pos[i]%3)*(w+gap);
//			int sy = (pos[i]/3)*(h+gap);
			puzzle.draw(g,this);
//			g.drawImage(img,x,y,x+w,y+h,// 화면 좌표
//						sx,sy,sx+w,sy+h,// 이미지 좌표
//					 		this);
		}
//		int[][] sarr = {
//				{0,0},{200,0},{400,0},{0,200},{200,200},{400,200},{0,400},{200,400},{400,400}
//		};
//		int dx,dy,sx,sy,cnt;
//		cnt=0; dy=0;
//		for (int i = 0; i < 3; i++) {
//			dx=0;
//			for (int j = 0; j < 3; j++) {
//				 sx = sarr[pos[cnt]][0]+gap;
//				 sy = sarr[pos[cnt]][1]+gap;
//				g.drawImage(img,dx,dy,dx+w,dy+h,// 화면 좌표
//						sx,sy,sx+w,sy+h,// 이미지 좌표
//					 		this);
//				dx +=(w+gap);
//				cnt++;
//			}
//			 dy += (h+gap);			
//		}
	}
}
