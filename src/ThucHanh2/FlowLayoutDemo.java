package ThucHanh2;

import java.awt.*;

import javax.swing.*;

public class FlowLayoutDemo extends JFrame {

	public static void main(String[] args) {
		FlowLayoutDemo f = new FlowLayoutDemo();
		f.setTitle("FlowLayoutDemo!");
		f.setBounds(200,500,700,700);
		f.setLayout(new FlowLayout());
		f.add(new JButton("OK"));
		f.add(new JButton("Cancel"));
		
		f.add(new JLabel("This is the lable"));
		f.add(new JTextField(7));
		f.add(new JTextArea(5,30));
		
		f.add(new Checkbox("Sport"));
		f.add(new Checkbox("Music"));
		f.add(new Checkbox("Tralve"));
		
		CheckboxGroup cg = new CheckboxGroup();
		f.add(new Checkbox("Female", cg, false));
		f.add(new Checkbox("Male", cg, true));
		
		Choice ch = new Choice();
		ch.addItem("Susport");
		ch.addItem("Music");
		ch.addItem("Travel");
		f.add(ch);
		List list = new List(3, false);
		list.add("Music");
		list.add("Travel");
		list.add("Game");
		list.add("Telen");
		f.add(list);
		f.setVisible(true);
	}

}
