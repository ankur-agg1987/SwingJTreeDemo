package swingjtreedemo;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Ankur-Agg
 */
public class SwingJTreeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Swing JTree Demo");
        JTree mytree;
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Category1");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Category2");
        DefaultMutableTreeNode i1 = new DefaultMutableTreeNode("item1");
        DefaultMutableTreeNode i2 = new DefaultMutableTreeNode("item2");
        DefaultMutableTreeNode e1 = new DefaultMutableTreeNode("element1");
        root.add(c1);
        root.add(c2);
        c1.add(i1);
        c1.add(i2);
        c2.add(e1);
        
        mytree = new JTree(root);
        
        frame.add(mytree);
        
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
