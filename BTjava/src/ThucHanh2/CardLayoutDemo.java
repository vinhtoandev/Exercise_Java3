package ThucHanh2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutDemo extends JFrame implements ActionListener{
	JButton order = new JButton("order");
	JButton product = new JButton("Product");
	CardLayoutDemo(){
		
		JPanel pn1 = new JPanel();
		pn1.setLayout(new FlowLayout());
		pn1.add(new JLabel("Product 1"));
		pn1.add(new JLabel("Product 2"));
		pn1.add(order);
		order.addActionListener(this);
		product.addActionListener(this);
		add("products", pn1);
		JPanel pn2 = new JPanel();
		pn2.add(new JTextField("Name: ",20));
		pn2.add(new JTextField("Address: ",20));
		pn2.add(new JTextField("Phone: ",20));
		pn2.add(new JButton("Order"));
		pn2.add(product);

		
	}
	public static void main(String[] args) {
		new CardLayoutDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
