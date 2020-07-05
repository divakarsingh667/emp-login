package p1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NullLayoutDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Null layout");

		JLabel lbEmail = new JLabel("Email");
		JLabel lbPassword = new JLabel("Password");

		JTextField txtEmail = new JTextField();
		JTextField txtPassword = new JPasswordField();

		JButton btnOK = new JButton("OK");
		JButton btnExit = new JButton("Exit");

		// Step1. Setting layout null
		frame.setLayout(null);

		// Step2. Set bounds
		lbEmail.setBounds(50, 50, 100, 50);
		// step3. adding the component
		frame.add(lbEmail);

		lbPassword.setBounds(50, 150, 100, 50);
		frame.add(lbPassword);

		btnOK.setBounds(50, 250, 100, 50);
		frame.add(btnOK);

		//////////////////////////////////////////////

		txtEmail.setBounds(200, 50, 100, 50);
		frame.add(txtEmail);

		txtPassword.setBounds(200, 150, 100, 50);
		frame.add(txtPassword);

		btnExit.setBounds(200, 250, 100, 50);
		frame.add(btnExit);

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
