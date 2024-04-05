package ThucHanh2;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		JTextField msg = new JTextField("Hien thi thong bao");
		msg.setEditable(false);
		JButton nutVe = new JButton("Ve");
		Canvas vungVe = new Canvas();
		vungVe.setSize(150,150);
		vungVe.setBackground(Color.white);
		Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL,0,10,30,100);
		Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL,0,10,30,100);
		frame.setLayout(new BorderLayout());
		frame.add(nutVe,BorderLayout.NORTH);
		frame.add(msg, BorderLayout.SOUTH);
		frame.add(vungVe, BorderLayout.CENTER);
		frame.add(sb1, BorderLayout.WEST);
		frame.add(sb2, BorderLayout.EAST);
		frame.setVisible(true);
	}
	
	
}
