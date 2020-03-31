package uzemGorsel01;

import java.awt.FlowLayout;
import javax.swing.*;

public class Uyg01 extends JApplet{
	public Uyg01() {
	}

	public void init() {
		getContentPane().setLayout(new FlowLayout());
		JButton buton1 = new JButton("Java Console");
		JButton buton2 = new JButton("Java GUI");
		JButton buton3 = new JButton("Java WEB");
		
		getContentPane().add(buton1);
		getContentPane().add(buton2);
		getContentPane().add(buton3);
		
		JButton btnOrnek = new JButton("Ornek Butonumuz");
		getContentPane().add(btnOrnek);
	}
	
}
