package swingjtreedemo;

import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;

/**
 *
 * @author Ankur-Agg
 */
public class JTreeDemo {
    public static void main(String []args){
        JFrame frame = new JFrame("Our JList Example");
        
        JTree tree;
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root Element");
        DefaultMutableTreeNode PInfo = new DefaultMutableTreeNode("Personal Info");
        DefaultMutableTreeNode name = new DefaultMutableTreeNode("Ankur");
        DefaultMutableTreeNode dept = new DefaultMutableTreeNode("CST");
        DefaultMutableTreeNode ContactInfo = new DefaultMutableTreeNode("Contact Info");
        DefaultMutableTreeNode phoneno = new DefaultMutableTreeNode("9911888492");
        DefaultMutableTreeNode emailid = new DefaultMutableTreeNode("ankur@mru.edu.in");
        DefaultMutableTreeNode room = new DefaultMutableTreeNode("LF07");
        
        root.add(PInfo);
        root.add(ContactInfo);
        PInfo.add(name);
        PInfo.add(dept);
        ContactInfo.add(phoneno);
        ContactInfo.add(emailid);
        ContactInfo.add(room);
        
        tree = new JTree(root);
        
        frame.add(tree);
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
