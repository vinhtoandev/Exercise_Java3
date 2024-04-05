package ThucHanh2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GiaiPTBacNhat extends Frame implements ActionListener {
	JFrame frame = new JFrame();
	Label lb1, lb2, lb3, lb;
	TextField txta, txtb, txtkq;
	Button tinh, reset, thoat;
	Panel pn, pn1, pn2, pn3;
	
	public void GUI() {
		
		frame.setSize(500,500);
		lb1 = new Label("Giai Phuong Trinh Bac Nhat");
		lb2 = new Label("Nhap a");
		lb3 = new Label("Nhap b");
		lb = new Label("Ket qua");
		
		txta = new TextField(7);
		txtb = new TextField(7);
		txtkq = new TextField();
		
		tinh = new Button("Tinh");
		reset = new Button("Reset");
		thoat = new Button("Thoat");
		
		tinh.addActionListener(this);
		reset.addActionListener(this);
		thoat.addActionListener(this);
		
		pn = new Panel(new GridLayout(3,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3,2));
		pn3 = new Panel(new GridLayout(1,3));
		
		pn1.add(lb1);
		
		pn2.add(lb2);
		pn2.add(txta);
		pn2.add(lb3);
		pn2.add(txtb);
		pn2.add(lb);
		pn2.add(txtkq);
		
		pn3.add(tinh);
		pn3.add(reset);
		pn3.add(thoat);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		
		frame.add(pn);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		GiaiPTBacNhat t = new GiaiPTBacNhat();
		t.GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tinh) {
			int a = Integer.parseInt(txta.getText());
			int b = Integer.parseInt(txtb.getText());
			if(a != 0) {
				txtkq.setText(Float.toString((float)-b/a));
			}
			else txtkq.setText("Phuong trinh vo nghiem");
		}
		if (e.getSource() == reset) {
			txta.setText("");
			txtb.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == thoat) {
			System.exit(0);
		}
	}

}
