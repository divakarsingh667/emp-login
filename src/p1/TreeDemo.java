package p1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class TreeDemo {

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		JFrame frame = new JFrame("PyJac");
		Container con = frame.getContentPane();
		
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("This PC");
		
		
		DefaultMutableTreeNode cDrive=new DefaultMutableTreeNode("C:");		
		DefaultMutableTreeNode dDrive=new DefaultMutableTreeNode("D:");
		
		DefaultMutableTreeNode aPdf=new DefaultMutableTreeNode("a.pdf");	
		cDrive.add(aPdf);
		
		
		root.add(cDrive);
		root.add(dDrive);
		
		
		JTree tree=new JTree(root);
		con.add(tree);

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
