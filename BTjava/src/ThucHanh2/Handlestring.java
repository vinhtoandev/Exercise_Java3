package ThucHanh2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Handlestring extends JFrame implements ActionListener{
	JLabel lb1, lb2, lb3, lb4, lb5;
	JTextField txt1, txt2, txt3, txt4, txt5;
	JButton ok, reset, exit;
	JPanel pn,pn1, pn2;
	
	public Handlestring() {
		lb1 = new JLabel("Enter a String");
		lb2 = new JLabel("To UpperCase");
		lb3 = new JLabel("To LowerCase");
		lb4 = new JLabel("To LowerUpper");
		lb5 = new JLabel("Number of word");
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt2.setEditable(false);
		txt3 = new JTextField();
		txt3.setEditable(false);
		txt4 = new JTextField();
		txt4.setEditable(false);
		txt5 = new JTextField();
		txt5.setEditable(false);
		pn1 = new JPanel(new GridLayout(5,2));
		pn1.add(lb1);
		pn1.add(txt1);
		pn1.add(lb2);
		pn1.add(txt2);
		pn1.add(lb3);
		pn1.add(txt3);
		pn1.add(lb4);
		pn1.add(txt4);
		pn1.add(lb5);
		pn1.add(txt5);
		
		ok = new JButton("OK");
		reset = new JButton("Reset");
		exit = new JButton("Exit");
		pn2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 0));
		pn2.add(ok);
		pn2.add(reset);
		pn2.add(exit);
		
		ok.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new JPanel(new BorderLayout());
		pn.add(pn1, BorderLayout.CENTER);
		pn.add(pn2, BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
		getContentPane().add(pn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Handlestring();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok) {
			String str = txt1.getText();
			String str1 = "";
			for (char c : str.toCharArray()) {
				if(c >='a' && c <='z') {
					c -= 32;
				}
				str1+=c;
			}
			txt2.setText(str1);
			String str2 ="";
			for (char c : str.toCharArray()) {
				if(c >= 'A' && c <= 'Z') {
					c+=32;
				}
				str2+=c;
			}
			txt3.setText(str2);
			String[] st = str.split(" ");
			txt5.setText(Integer.toString(st.length));
			str = "";
			for (String s : st) {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (i == 0) {
						str+=Character.toLowerCase(c);
					}
					else {
						str+=Character.toUpperCase(c);
					}
				}
				str+=" ";
			}
			txt4.setText(str);
		}
		if (e.getSource() == reset) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
			txt5.setText("");
		}
		if(e.getSource() == exit) {
			System.exit(0);
		}
		
	}

}
