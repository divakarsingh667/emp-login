package p1;

import javax.swing.JFrame;

public class FrameDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("PyJac");

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
