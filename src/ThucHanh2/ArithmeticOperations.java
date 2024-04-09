package ThucHanh2;

import java.awt.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ArithmeticOperations extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JLabel td, lb1, lb2, lb3;
	JTextField txt1, txt2, txt3;
	JButton add, sub, mul, div, reset, exit;
	JPanel pn, pn1, pn2, pn3, pn4;
	
	public ArithmeticOperations() {
		td = new JLabel("Basic Arithmetic Operations");
		pn1 = new JPanel(new FlowLayout());
		pn1.add(td);
		
		lb1 = new JLabel("Number 1:");
		lb2 = new JLabel("Number 2:");
		lb3 = new JLabel("Result:");
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		txt3 = new JTextField(10);
		pn2 = new JPanel(new GridLayout(3,2));
		pn2.add(lb1);
		pn2.add(txt1);
		pn2.add(lb2);
		pn2.add(txt2);
		pn2.add(lb3);
		pn2.add(txt3);
		
		add = new JButton("Addition");
		sub = new JButton("Subtraction");
		mul = new JButton("Multiplication");
		div = new JButton("Division");
		pn3 = new JPanel(new FlowLayout());
		pn3.add(add);
		pn3.add(sub);
		pn3.add(mul);
		pn3.add(div);
		
		reset = new JButton("Reset");
		exit = new JButton("Exit");
		pn4 = new JPanel(new FlowLayout());
		pn4.add(reset);
		pn4.add(exit);
		
		pn = new JPanel(new GridLayout(4,1));
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		frame.add(pn);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new ArithmeticOperations();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(txt1.getText());
		int b = Integer.parseInt(txt2.getText());
		double kq;
		if(e.getSource() == add) {
			kq = a + b;
			txt3.setText(Double.toString(kq));
		}
		if(e.getSource() == sub) {
			kq = a - b;
			txt3.setText(Double.toString(kq));
		}
		if(e.getSource() == mul) {
			kq = a * b;
			txt3.setText(Double.toString(kq));
		}
		if(e.getSource() == div) {
			kq = (double)a / b;
			txt3.setText(Double.toString(kq));
		}
		if(e.getSource() == reset) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
		if(e.getSource() == exit) {
			System.exit(0);
		}
	}

}
