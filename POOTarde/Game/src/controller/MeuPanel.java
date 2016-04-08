package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MeuPanel extends JPanel implements KeyListener{
	// public int x1 = 50;
	// public int y1 = 50;
	public int velx = 10;
	public int vely = 10;
	public Rectangle barra = new Rectangle(500, 150, 15, 100);
	public Rectangle bola = new Rectangle(50, 50, 20, 20);

	public void paint(Graphics g) {
		g.clearRect(0, 0, 600, 480);
		g.fillOval(bola.x, bola.y, bola.width, bola.height);
		g.setColor(Color.RED);
		g.fillRect(barra.x, barra.y, barra.width, barra.height);
	}

	public void Regras() {
		bola.x += velx;
		bola.y += vely;
		if (bola.x > (getWidth() - bola.width) || bola.x < 0) {
			velx *= -1;
		}
		if (bola.y > (getHeight() - bola.height) || bola.y < 0) {
			vely *= -1;
		}
		
		//teste y
		if(bola.intersects(barra)){
			velx*=-1;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='w'){
			barra.y -= 30;
		}else if(e.getKeyChar() =='s'){
			barra.y += 30;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
