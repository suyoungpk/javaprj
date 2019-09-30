package game.role;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import 가변배열.ObjectList;


public class RoleCanvas extends Canvas implements MouseListener,KeyListener{
		private Kid kid;
		private Background bg;
		//private Missile[] missiles;
		//private ObjectList missiles;	
		private List<Missile> missiles;
		//int cnt;
		public RoleCanvas() {
			bg = new Background();
			kid = new Kid();
			//missiles = new Missile[100];
			missiles = new ArrayList<>();
			//cnt=0;
			new Thread(()->{
				while(true) {
					try {
						kid.update();
						bg.update();
						
						//if (missiles[cnt-1] != null) missiles[cnt-1].update();
//						for (int i = 0; i < cnt; i++) {
//							if (missiles[i] != null) missiles[i].update();
//						}
//						for(Object o :missiles) { // for-each에서 사용하려면 열거 서비스를 해줘야 한다
//							//Missile m = (Missile) o;
//							((Missile) o).update();
//						}
						for (Missile m :missiles) m.update();
						Thread.sleep(10);//17ms동안 잠시 멈춤
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
			Image bufImg = createImage(this.getWidth(),this.getHeight()); // 이미지 보드 생성
			Graphics g2  = bufImg.getGraphics();// 그래픽툴을 가진 가상이미지 객체를 g2 
			bg.draw(g2,this);// g2로 가상이미지에 그림을 그리는데 나중에 이 캔버스에 붙일거야
//			if (missiles[0] != null) missiles[0].draw(g2,this);
//			for (int i = 0; i < cnt; i++) {
//				if (missiles[i] != null) missiles[i].draw(g2,this);
//			}
//			for(Object o :missiles) {
//				((Missile) o).draw(g2,this);
//			}
//			for (int i = 0; i < missiles.size(); i++) {
//				missiles.get(i).draw(g2,this);
//			}
			for (Missile m :missiles) m.draw(g2,this);
			kid.draw(g2,this);
			
			g.drawImage(bufImg,0,0,this); // 다 그려진 그림을 지금 캔버스에 붙여
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
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				kid.move(Direction.LEFT);
				break;
			case KeyEvent.VK_RIGHT:
				kid.move(Direction.RIGHT);
				break;
			case KeyEvent.VK_SPACE:
				Missile m = kid.fire();
				if (m != null) {
					missiles.add(m);
				}
				
				//missiles[cnt] = kid.fire();
				//cnt++;
				//kid.move(Direction.SPACE);
				break;
			default:
				break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			kid.imgChg();
		}
}
