package ThucHanh2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.List;

public class ActionEventTest extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lb1;
	private JButton btnNewButton;

	private List list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventTest frame = new ActionEventTest();
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
	public ActionEventTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Ok");
		btnNewButton.addMouseListener(this);
		btnNewButton.setBounds(115, 22, 85, 21);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(205, 23, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addMouseListener(this);
		
		
		
		
		
		lb1 = new JLabel("the event is display here\r\n");
		lb1.setBounds(183, 90, 170, 27);
		contentPane.add(lb1);
		
		list = new List();
		list.setBounds(318, 10, 96, 41);
		list.add("lion");
		list.add("tiger");
		list.add("elephan");
		list.add("monkey");
		list.addMouseListener(this);
		contentPane.add(list);
		
		
	}


	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getSource() == btnNewButton) {
			lb1.setText("you clicked button ok");
		}
		if(e.getSource() == textField) {
			lb1.setText("you clicked text field");
		}
		if(e.getSource() == list && e.getClickCount() == 2) {
			lb1.setText(list.getSelectedItem()+" ");
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
}
