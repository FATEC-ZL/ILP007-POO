package edu.fatec;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho extends JPanel {
	private static final long serialVersionUID = -4406182850001721030L;

	@Override
	public void paint(Graphics g) { 
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawRect(10, 10, 50, 50);
		int pCx = 10 + 50 / 2;
		int pCy = 10 + 50 / 2;
		int pEx = pCx - 3;
		int pEy = pCy - 3;
		g.fillOval(pEx, pEy, 6, 6);
	}
}