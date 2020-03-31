package uzemGorsel01;

import javax.swing.*;
import java.awt.*;

public class Uyg04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame c = new JFrame("Otomobil Ozellikleri");
		c.setLayout(new FlowLayout());
		
		JCheckBox oto1 = new JCheckBox("ABS");
		oto1.setSelected(true);
		c.add(oto1);
		
		JCheckBox oto2 = new JCheckBox("Cd Calar");
		JCheckBox oto3 = new JCheckBox("Hava Yastigi");
		JCheckBox oto4 = new JCheckBox("Klima");
		oto4.setSelected(true);
		
		c.add(oto2);
		c.add(oto3);
		c.add(oto4);
		
		c.setVisible(true);
		c.pack();
		
	}

}
