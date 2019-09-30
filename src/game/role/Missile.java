package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missile {
	private int x;
	private int y;
	private Image img;
	private int vx;
	private int vy;
	private int w;
	private static final int M_OFFSET_LEFT;
	static {
		M_OFFSET_LEFT=10;
	}
	public Missile() {
		this(0,0);
	}
	public Missile(int x, int y) {
		this.x=x;
		this.y=y;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/res/missile.png");
	}
	public void update() {
		//x += vx;
		//y += vy;
		y--;
	}
	public void draw(Graphics g, RoleCanvas role) {
		g.drawImage(img, x-M_OFFSET_LEFT, y, role);
	}
}
