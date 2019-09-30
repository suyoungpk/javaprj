package game.shooting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	 int x, y;
	 int vx,vy,dx,dy;
	 float w,h,d;
	 int width;
	 Image img;
	 String url;
	 Bullet bullet;
	 Graphics g;
	 ShootingCanvas canvas;
	Fighter(){
		x=100;
		y=100;
		width=70;
		url = "src/res/fighter.png";
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage(url);
		bullet = new Bullet();
		
	}
	Fighter(int x,int y,String url){
		width=70;
		this.x=x;
		this.y=y;
		this.url = url;
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.img = tk.getImage(this.url);
	}
	public void draw(Graphics g,ShootingCanvas canvas) {
		this.g = g;
		this.canvas = canvas;
		g.drawImage(img, x, y, canvas);
		
	}
	public void move(int x2, int y2) {
		this.dx=x2;
		this.dy=y2;
		w = (dx-x);
		h = (dy-y);
		d = (float)Math.sqrt(w*w+h*h);
		vx = (int)(w/d*10);
		vy = (int)(h/d*10);
	}
	public void update() {
		x += vx;
		y += vy;
		if(vx <= 0  && vy <= 0) {
			vx = 0;
			vy = 0;
		}
	}
	public void attack() {
		int bx = (dx-x)/2;
		//bullet.draw(g,canvas,bx,y+10);
		//bullet.move(this.y+300);
	}
}
