package ThucHanh2;

import java.awt.EventQueue;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class KeyEvent extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyEvent frame = new KeyEvent();
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
	public KeyEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New");
		lblNewLabel.setBounds(191, 111, 45, 13);
		contentPane.add(lblNewLabel);
		addKeyListener(this);
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		lblNewLabel.setText(e.getKeyChar() + "");
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
	}

}
