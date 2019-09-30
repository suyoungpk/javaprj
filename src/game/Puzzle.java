package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle {
	private int x,y,sx,sy,w,h,gap;
	Image img;
	public Puzzle() {
		w = 200;
		h = 200;
		gap = 10;
		
		Toolkit tk = Toolkit.getDefaultToolkit();// static 함수~
		img = tk.getImage("src/res/ground.jpg");
		
	}
	public void setPos(int index) {
		x = (index%3)*(w+gap);
		y = (index/3)*(h+gap);
	}
	public void setSrc(int pos) {
		sx = (pos%3)*(w+gap);
		sy = (pos/3)*(h+gap);
	}
	public void draw(Graphics g, PuzzleCanvas canvas) {
		g.drawImage(img,x,y,x+w,y+h,// 화면 좌표
				sx,sy,sx+w,sy+h,// 이미지 좌표
				canvas);
	}
}
