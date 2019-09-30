package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvas extends Canvas {
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		//g.drawRect(100, 100, 200, 600);
		Toolkit tk = Toolkit.getDefaultToolkit();// static 함수~
		Image img = tk.getImage("src/res/foto9.jpg");
		
		{
			int x = 0;
			int y = 0;
			int w = 200;
			int h = 200;
			
			g.drawImage(img,x,y,x+w,y+h,// 화면 좌표
					 		0,0,200,200,// 이미지 좌표
					 		this);//observer : 그리는 곳// 현재는  GameFrame 이니까 this를 써줌
		}
		{
			int x = 200;
			int y = 0;
			int w = 200;
			int h = 200;
			g.drawImage(img,x,y,x+w,y+h,0,200,200,400,this);
		}
		{
			int x = 0;
			int y = 200;
			int w = 200;
			int h = 200;
			g.drawImage(img,x,y,x+w,y+h,200,0,400,200,this);
		}
		{
			int x = 200;
			int y = 200;
			int w = 200;
			int h = 200;
			g.drawImage(img,x,y,x+w,y+h,200,200,400,400,this);
		}
	}
}
