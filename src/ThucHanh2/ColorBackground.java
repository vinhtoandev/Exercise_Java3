package ThucHanh2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorBackground extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton red, green, blue, thoat;
	JPanel pn;
	public ColorBackground() {
		red = new JButton("Red");
		blue = new JButton("Blue");
		green = new JButton("Green");
		thoat = new JButton("Thoat");
		pn = new JPanel(new FlowLayout());
		pn.add(red);
		pn.add(green);
		pn.add(blue);
		pn.add(thoat);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		thoat.addActionListener(this);
		frame.setLayout(new BorderLayout());
		frame.add(pn,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public static void main(String[] str) {
		new ColorBackground();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == red) {
			frame.getContentPane().setBackground(Color.red);
			pn.setBackground(Color.red);
		}
		if(e.getSource() == blue) {
			frame.getContentPane().setBackground(Color.blue);
			pn.setBackground(Color.blue);
		}
		if(e.getSource() == green) {
			frame.getContentPane().setBackground(Color.green);
			pn.setBackground(Color.green);
		}
		if(e.getSource() == thoat) {
			System.exit(0);
		}
		
	}
}
