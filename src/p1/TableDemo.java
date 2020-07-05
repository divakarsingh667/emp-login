package p1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

public class TableDemo {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		JFrame frame = new JFrame("PyJac");
		Container con = frame.getContentPane();

		String[] cols = { "Name", "Age", "Salary" };

		Object[][] data = { { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 }, { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 }, { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 }, { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 }, { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 }, { "Aamir", 23, 1100 }, { "Mayank", 24, 1200 }, { "Himanshu", 20, 1000 },
				{ "Pradeep", 25, 3000 } };

		JTable table = new JTable(data, cols);

		JScrollPane jsp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		con.add(jsp);

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
