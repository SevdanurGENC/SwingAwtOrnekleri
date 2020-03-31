package uzemGorsel01;

import java.awt.FlowLayout;
import javax.swing.*;

public class Uyg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame cerceve = new JFrame("Frame Uygulamasi");
		cerceve.getContentPane().setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Java Console");
		JButton b2 = new JButton("Java GUI");
		JButton b3 = new JButton("Java WEB");
		
		cerceve.getContentPane().add(b1);
		cerceve.getContentPane().add(b2);
		cerceve.getContentPane().add(b3);
		
		JButton btnOrnek = new JButton("OrnekButonumuz");
		cerceve.getContentPane().add(btnOrnek);
		
		cerceve.setVisible(true);
		cerceve.pack();
		
		
		
	}

}
