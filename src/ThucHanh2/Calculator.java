package ThucHanh2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	JTextField txt;
	JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,equal,div, mul, add, sub,c,dot;
	JPanel pn, pn0, pn1, pn2;
	public Calculator() {
		txt = new JTextField(10);
		Font ft = new Font("dsfdsa",Font.BOLD, 20);
		txt.setFont(ft);
		pn0 = new JPanel(new FlowLayout());
		pn0.add(txt);
		
		bt0 = new JButton("0");
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		dot = new JButton(".");
		c = new JButton("C");
		equal = new JButton("=");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		
		pn1 = new JPanel(new GridLayout(4,4));
		pn1.add(bt7);
		pn1.add(bt8);
		pn1.add(bt9);
		pn1.add(div);
		pn1.add(bt4);
		pn1.add(bt5);
		pn1.add(bt6);
		pn1.add(mul);
		pn1.add(bt1);
		pn1.add(bt2);
		pn1.add(bt3);
		pn1.add(sub);
		pn1.add(bt0);
		pn1.add(dot);
		pn1.add(c);
		pn1.add(add);
		
		equal.setPreferredSize(new Dimension(40,210));
		equal.setText("=");
		pn2 = new JPanel(new FlowLayout());
		pn2.add(equal);
		
		pn = new JPanel(new BorderLayout());
		pn.add(pn0, BorderLayout.NORTH);
		pn.add(pn2, BorderLayout.EAST);
		pn.add(pn1);
		
		bt0.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		add.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		c.addActionListener(this);
		sub.addActionListener(this);
		equal.addActionListener(this);
		dot.addActionListener(this);
		
		setSize(300,300);
		add(pn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	double evaluate(String expression) {
		
		return new Object() {
			int pos = -1, ch;

			void nextChar() {
				ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
			}

			boolean eat(int charToEat) {
				while (ch == ' ')
					nextChar();
				if (ch == charToEat) {
					nextChar();
					return true;
				}
				return false;
			}

			double parse() {
				nextChar();
				double x = parseExpression();
				if (pos < expression.length())
					throw new RuntimeException("Ký tự không hợp lệ: " + (char) ch);
				return x;
			}

			double parseExpression() {
				double x = parseTerm();
				for (;;) {
					if (eat('+'))
						x += parseTerm(); // Cộng
					else if (eat('-'))
						x -= parseTerm(); // Trừ
					else
						return x;
				}
			}

			double parseTerm() {
				double x = parseFactor();
				for (;;) {
					if (eat('*'))
						x *= parseFactor(); // Nhân
					else if (eat('/'))
						x /= parseFactor(); // Chia
					else
						return x;
				}
			}

			double parseFactor() {
				if (eat('+'))
					return parseFactor(); // Dấu cộng
				if (eat('-'))
					return -parseFactor(); // Dấu trừ
				double x;
				int startPos = this.pos;
				if (ch >= '0' && ch <= '9') { // Số
					while ((ch >= '0' && ch <= '9') || ch == '.')
						nextChar();
					x = Double.parseDouble(expression.substring(startPos, this.pos));
				} else {
					throw new RuntimeException("Ký tự không hợp lệ: " + (char) ch);
				}

				return x;
			}
		}.parse();
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt0) {
			txt.setText(txt.getText() + "0");
		}
		if(e.getSource() == bt1) {
			txt.setText(txt.getText() + "1");
		}
		if(e.getSource() == bt2) {
			txt.setText(txt.getText() + "2");
		}
		if(e.getSource() == bt3) {
			txt.setText(txt.getText() + "3");
		}
		if(e.getSource() == bt4) {
			txt.setText(txt.getText() + "4");
		}
		if(e.getSource() == bt5) {
			txt.setText(txt.getText() + "5");
		}
		if(e.getSource() == bt6) {
			txt.setText(txt.getText() + "6");
		}
		if(e.getSource() == bt7) {
			txt.setText(txt.getText() + "7");
		}
		if(e.getSource() == bt8) {
			txt.setText(txt.getText() + "8");
		}
		if(e.getSource() == bt9) {
			txt.setText(txt.getText() + "9");
		}
		if(e.getSource() == c) {
			String str = "";
			for (int i = 0;i < txt.getText().length() - 1; i++) {
				str+=txt.getText().charAt(i);
			}
			txt.setText(str);
		}
		if(e.getSource() == add) {
			txt.setText(txt.getText() + "+");
		}
		if(e.getSource() == sub) {
			txt.setText(txt.getText() + "-");
		}
		if(e.getSource() == mul) {
			txt.setText(txt.getText() + "*");
		}
		if(e.getSource() == div) {
			txt.setText(txt.getText() + "/");
		}
		if(e.getSource() == dot) {
			txt.setText(txt.getText() + ".");
		}
		if(e.getSource() == equal) {
			txt.setText(Double.toString(evaluate(txt.getText())));
		}
		
	}

}
