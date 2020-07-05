package p2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame_all extends JFrame {

	public LoginFrame_all() {

		setLayout(new GridBagLayout());
		Container con = getContentPane();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		JLabel lbEmail = new JLabel("Email");
		JLabel lbPass = new JLabel("Password");

		JTextField txtEmail = new JTextField(15);
		JTextField txtPass = new JPasswordField(15);

		JButton btnOK = new JButton("OK");
		JButton btnExit = new JButton("EXIT");

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

		/*********** Color Demo *************/

		Color textColor = Color.RED;
		Color backColor = new Color(150, 200, 100);

		txtEmail.setForeground(textColor);
		txtEmail.setBackground(backColor);

		// JLable is by default transparent unlike anoher components, So we have to make
		// opaque.
		//lbEmail.setOpaque(true);
		lbEmail.setForeground(txtEmail.getBackground());
		lbEmail.setBackground(txtEmail.getForeground());
		
		/*********** Cursor demo *************/
		
		Cursor cursor=new Cursor(Cursor.WAIT_CURSOR);
		btnOK.setCursor(cursor);
		
		Cursor cursor2=new Cursor(Cursor.HAND_CURSOR);
		btnExit.setCursor(cursor2);
		
		/*********** Font demo *************/
		
		Font font =new Font("Arial", Font.ITALIC, 40);
		lbEmail.setFont(font);
		
		

		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
