package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class LottoCanvas extends Canvas{
	private int[] lotto = {1,3,5,9,10,12};
	public LottoCanvas() {
		
	}
	@Override
	public void paint(Graphics g) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("src/res/cards.png");	
		int w = 58;
		int h = 79;
		int gap = 5;		
		for (int i = 0; i <lotto.length; i++) {
			int x = (i%13)*(w+gap);
			int y = (i/13)*(h+gap);
			int sx = ((lotto[i]-1)%13)*(w+gap);
			int sy = ((lotto[i]-1)/13)*(h+gap);
			g.drawImage(img,x,y,x+w,y+h,// È­¸é ÁÂÇ¥
					sx,sy,sx+w,sy+h,// ÀÌ¹ÌÁö ÁÂÇ¥
					 		this);
		}
	}
}
