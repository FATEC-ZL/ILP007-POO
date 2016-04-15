package game;

import javax.swing.JFrame;

public class Jogo {
	private JFrame Janela = new JFrame("Tenis de Mesa");
	private MeuPanel Painel = new MeuPanel();
	static boolean flag = true;

	public Jogo() {
		Janela.setContentPane(Painel);
		Janela.setSize(600, 480);
		Janela.setVisible(true);
		Janela.setResizable(false);
		Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Painel.addKeyListener(Painel);
		Painel.setFocusable(true);
		Painel.requestFocus();
	}

	public void loop() {
		while (true) {
			// regras
//			if (flag == true) {
//				Painel.x1 += 10;
//			}
//			if (Painel.x1 == 500) {
//				flag = false;
//			}
//			if(Painel.x1 == 0){
//				flag = true;
//			}
//			if (flag == false) {
//				Painel.x1-=10;
//				Painel.y1+=1;
//			}
			Painel.Regras();
			try {
				Thread.sleep(19);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Painel.repaint();
			// checar eventos

		}
	}
}
