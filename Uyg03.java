package uzemGorsel01;

import java.awt.*;
import javax.swing.*;

public class Uyg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JTextField kullaniciAdi, Sifre;
		
		kullaniciAdi = new JTextField(20);
		Sifre = new JTextField(10);
		
		JFrame cerceve = new JFrame("Kullanici Giris Ekrani");
		cerceve.setLayout(new GridLayout(2,2));
		
		cerceve.add(new JLabel("Kullanici Adini Giriniz : "));    // (1,1)
		//cerceve.add(kullaniciAdi);  // (1,2)
		cerceve.add(new JTextField(10));
		cerceve.add(new JLabel("Sifrenizi Giriniz : "));  // (2,1)
		//cerceve.add(Sifre);   // (2,2)
		cerceve.add(new JTextField(10));
		
		
		cerceve.setSize(300,200);
		cerceve.setVisible(true);
		cerceve.pack(); 
		
	}

}
