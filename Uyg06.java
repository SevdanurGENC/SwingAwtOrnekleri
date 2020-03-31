package uzemGorsel01;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.*;

public class Uyg06 extends JApplet{

	String isim;
	
	public void init() {
		
		isim = JOptionPane.showInputDialog(null,"Isminizi Giriniz :");
		System.out.println("Girmis oldugunuz isim : " + isim);	
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString(isim, 50, 50);		
	}
	
	
}
