package uzemGorsel01;
import javax.swing.*;
import java.awt.*;

public class Uyg05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame cer = new JFrame("Cinsiyetiniz Nedir?");
		cer.setLayout(new FlowLayout());
		
		JRadioButton erkek = new JRadioButton("ERKEK");
		JRadioButton kadin = new JRadioButton("KADIN");
		
		kadin.setSelected(true);
		
		cer.add(erkek);
		cer.add(kadin);
		
		cer.setVisible(true);
		cer.setSize(250,80);
		cer.pack();
		
		
	}

}
