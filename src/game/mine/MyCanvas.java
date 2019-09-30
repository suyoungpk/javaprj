package game.mine;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyCanvas extends Canvas implements MouseListener,KeyListener{
		private Dog dog;
		private Background bg;
		public MyCanvas() {
			bg = new Background();
			dog = new Dog();
			new Thread(()->{
				while(true) {
					try {
						dog.update();
						Thread.sleep(120);//17ms���� ��� ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
			}).start();
			addMouseListener(this);
			addKeyListener(this);
		}
		@Override
		public void paint(Graphics g) {
			Image bufImg = createImage(this.getWidth(),this.getHeight()); // �̹��� ���� ����
			Graphics g2  = bufImg.getGraphics();// �׷������� ���� �����̹��� ��ü�� g2 
			bg.draw(g2,this);// g2�� �����̹����� �׸��� �׸��µ� ���߿� �� ĵ������ ���ϰž�
			dog.draw(g2,this);
			
			g.drawImage(bufImg,0,0,this); // �� �׷��� �׸��� ���� ĵ������ �ٿ�
		}
		@Override
		public void update(Graphics g) {
			paint(g);
		}
		@Override
		public void mouseClicked(MouseEvent e) {
		
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void keyTyped(KeyEvent e) {			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
		@Override
		public void keyReleased(KeyEvent e) {			
		}
}
