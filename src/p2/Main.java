package p2;

import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new LoginFrame();
	}

}
