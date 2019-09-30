package game.mine;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private int x;
	private int y;
	private Image img;
	
	public Background() {
		x=0;
		y=0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src\\res\\ground.jpg");
	}

	public void draw(Graphics g, MyCanvas roleCanvas) {
		g.drawImage(img, x, y, roleCanvas);		
	}

}
