package p1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.UIManager;

public class SplitPaneDemo {

	public SplitPaneDemo() {

		JFrame frame = new JFrame("PyJac");

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		JButton btnLeft = new JButton("Left");
		JButton btnRight = new JButton("Right");

		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, btnLeft, btnRight);
		jsp.setOneTouchExpandable(true);
		jsp.setDividerLocation(250);

		frame.getContentPane().add(jsp);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
