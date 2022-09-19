import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class Calculator {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(SystemColor.desktop);
		frame.setTitle("Calculator");
		frame.getContentPane().setBackground(SystemColor.windowText);
		frame.setBounds(100, 100, 368, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Calculator");
		l1.setBounds(50, 10, 259, 42);
		l1.setForeground(SystemColor.inactiveCaptionBorder);
		l1.setBackground(Color.BLACK);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Arial", Font.BOLD, 23));
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(22, 52, 304, 42);
		t1.setFont(new Font("Tahoma", Font.BOLD, 16));
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.BLACK);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		
	}
}
