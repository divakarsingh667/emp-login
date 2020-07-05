package p2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import db.EmpDAO;
import p1.SplitPaneDemo;

public class LoginFrame extends JFrame {

	public LoginFrame() {

		setLayout(new GridBagLayout());
		Container con = getContentPane();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		JLabel lbEmail = new JLabel("Email");
		JLabel lbPass = new JLabel("Password");

		JTextField txtEmail = new JTextField(15);
		JTextField txtPass = new JPasswordField(15);

		JButton btnOK = new JButton("OK");

		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String email = txtEmail.getText();
				String password = txtPass.getText();

				boolean isLogin = EmpDAO.isAuthenticate(email, password);

				if (isLogin) {
					JOptionPane.showMessageDialog(null, "Login Successfull");
				} else {

					JOptionPane.showMessageDialog(null, "Login Failed...");
				}

			}
		});

		JButton btnExit = new JButton("EXIT");

		btnExit.addActionListener(e -> {

			System.out.println("Exit");

			System.exit(0);

		});

		gbc.gridx = 0;
		gbc.gridy = 0;
		con.add(lbEmail, gbc);

		gbc.gridy = 1;
		con.add(lbPass, gbc);

		gbc.gridy = 2;
		con.add(btnOK, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		con.add(txtEmail, gbc);

		gbc.gridy = 1;
		con.add(txtPass, gbc);

		gbc.gridy = 2;
		con.add(btnExit, gbc);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
