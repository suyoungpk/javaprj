package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameFrame extends Frame {
	//private Fighter fighter;
	private Canvas canvas;
	public GameFrame() {
		setBounds(100, 100, 800, 800);
		setBackground(Color.black);
		setVisible(true);
		//fighter = new Fighter();
		//canvas = new LottoCanvas(); 
		canvas = new PuzzleCanvas(); // ������ ������ �� ��ȭ�� ����
		add(canvas); // ĵ���� ���� ��ü �����쿡 ���̱� �۾�
	}
	
}
