package game.shooting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Bullet {
	 int x, y;
	 int vx,vy,dx,dy;
	 float w,h,d;
	 Image img;
	 String url;
	 
	public Bullet() {
		x=0;
		y=490;
		url = "src/res/bullet.png";
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage(url);
	}
	public void move(int dy) {
		this.dy = dy;
		vy = (int)((dy-y)/15);
		
	}
	public void update() {
		y += vy;
		System.out.println("y:"+vy);
		if(y < dy) {
			vy = 0;
			y=490;
		}
	}
	public void draw(Graphics g,ShootingCanvas canvas, int x) {
		this.x=x;
		g.drawImage(img, x, y, canvas);
	}
}
