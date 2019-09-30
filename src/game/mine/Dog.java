package game.mine;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Dog {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private int w;
	private int h;
	
	private Image img;
	private int imgIndex;
	
	public Dog() {
		x=100;
		y=100;
		w=87;
		h= 230;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("C:\\eclipse\\workspace\\JavaPrj\\src\\res\\dog.png");
		imgIndex = 0;
		
	}

	public void update() {
		imgIndex++;
		if(imgIndex<0)imgIndex=0;
		else if(imgIndex>6) imgIndex=0;
	}
	public void draw(Graphics g, MyCanvas canvas) {
		g.drawImage(img, x, y, x+w, y+h, w*imgIndex, 0, w*imgIndex+w, h, canvas);
	}
	

}
