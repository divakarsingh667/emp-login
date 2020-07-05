package p1;

import java.awt.Container;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("PyJac");

		JLabel lbCenter = new JLabel("Hi", JLabel.CENTER);

		Container con = frame.getContentPane();

		URL url = ImageDemo.class.getResource("/pics/abc.png");
		ImageIcon icon = new ImageIcon(url);
		lbCenter.setIcon(icon);

		URL urlLogo = ImageDemo.class.getResource("/pics/logo.png");
		ImageIcon iconLogo = new ImageIcon(urlLogo);
		frame.setIconImage(icon.getImage());

		con.add(lbCenter);

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

}
