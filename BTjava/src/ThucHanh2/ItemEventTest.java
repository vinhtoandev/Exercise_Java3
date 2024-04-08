package ThucHanh2;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.List;

public class ItemEventTest extends JFrame implements MouseListener, ItemListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox cb1,cb2;
	private ButtonGroup cbgroup;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private List list;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemEventTest frame = new ItemEventTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ItemEventTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cb1 = new JCheckBox("Male");
		cb1.setBounds(65, 22, 59, 21);
		contentPane.add(cb1);
		cb1.addMouseListener(this);
		
		cb2 = new JCheckBox("Female");
		cb2.setBounds(126, 22, 74, 21);
		contentPane.add(cb2);
		cb2.addMouseListener(this);
		cbgroup = new ButtonGroup();
		cbgroup.add(cb1);
		cbgroup.add(cb2);
		comboBox = new JComboBox();
		comboBox.setBounds(220, 22, 48, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		contentPane.add(comboBox);
		comboBox.addItemListener(this);
		
		lblNewLabel = new JLabel("the event is displayed here");
		lblNewLabel.setBounds(144, 86, 166, 13);
		contentPane.add(lblNewLabel);
		
		list = new List();
		list.setBounds(274, 10, 104, 56);
		list.add("lion");
		list.add("tiger");
		list.add("elephan");
		list.add("monkey");
		list.addMouseListener(this);
		contentPane.add(list);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getSource() == cb1) {
			lblNewLabel.setText(cb1.getText());
		}
		if(e.getSource() == cb2) {
			lblNewLabel.setText(cb2.getText());
		}
		if(e.getSource() == list && e.getClickCount() == 2) {
			lblNewLabel.setText(list.getSelectedItem().toString());
		}
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == comboBox) {
			lblNewLabel.setText(comboBox.getSelectedItem() + " selected");
		}
		
	}

}
