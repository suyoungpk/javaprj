package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private int dx;
	private int dy;
	
	private int w;
	private int h;
	public static final int OFFSET_LEFT;
	public static final int OFFSET_TOP;
	private Image img;
	private int imgIndex;
	private int imgdre;
	private int timeForReady;
	static {
		OFFSET_LEFT = 32;
		OFFSET_TOP = 32;
	}
	public Kid() {
		x=250;
		y=300;
		w=h= 64;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("C:\\eclipse\\workspace\\JavaPrj\\src\\res\\fighter2.png");
		imgIndex = 3;
		imgdre = 0;
		
	}

	public void update() {
				
		vx--; 
	    if(vx < 0 ) vx = 0;
		if (timeForReady>0) timeForReady--;
		
		switch (imgdre) {
		case 1:
			imgIndex--; 
			x -= vx;
			if(imgIndex<0)imgIndex=0;
			if(x<0)x=0;
			break;
		case 2:
			imgIndex++;
			x += vx;
			if(imgIndex>6)imgIndex=6;
			if(x>800)x=750;
			break;

		default:imgIndex = 3;
			break;
		}
		
	}
	public void draw(Graphics g, RoleCanvas roleCanvas) {
		//g.drawImage(img, 0, 0, roleCanvas);
		int sx = w*imgIndex;
		g.drawImage(img, x-OFFSET_LEFT, y-OFFSET_TOP, x-OFFSET_LEFT+w, y-OFFSET_TOP+h, sx, 0, sx+w, h, roleCanvas);
		
	}
	public void move(Direction dir) {
		
		switch (dir) {
		case LEFT: 
			vx = 15;
			//imgIndex--; 
			//x -=2;
			imgdre = 1;
//			if(imgIndex<0)imgIndex=0;
			//if(x<0)x=0;
		break;
		case RIGHT: 
			vx = 15;
			//imgIndex++;
			//x += 2;
			imgdre = 2;
			//if(imgIndex>6)imgIndex=6;
			//if(x>500)x=500;
		break;
		default:
			break;
		}
		
	}
	public void imgChg() {
		imgdre=0;
	}

	public Missile fire() {
		//Missile m = new Missile(x,y);
		if (timeForReady == 0) {
			Missile m = new Missile(x,y);
			timeForReady = 0;
			return m;
		}
		return null;
	}
}
