import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

//This class implements the AddComponent interface as per the 
//composite design pattern. Unlike the AddUser class, this class 
//is designed to treat any group node in the tree to allow other groups
//or users to be added under it.

public class AddGroup implements AddComponent {
    // pointer instance to be referenced when accessing class's methods
    public static AddGroup pointer = new AddGroup();

    // private constructor following Singleton pattern to ensure only
    // one instance being run at a time
    private AddGroup() {

    }

    // This add method is called when a specific node in the tree is not selected
    // and a group is simply added, most likely in the beginning stages of the test
    // run.
    // There is a if-else statement to ensure if the group ID exists, or is
    // null/empty
    public void add(String group) {
        ArrayList<String> tempGroups = Twitter.pointer.getGroups();

        if (tempGroups.contains(group) || group == null || group.length() == 0) {

            JFrame frame2 = new JFrame("Error");
            JLabel label = new JLabel("This group ID already exists or is invalid.");

            JPanel panel = new JPanel(new BorderLayout(5, 5));
            BoxLayout box = new BoxLayout(panel, BoxLayout.X_AXIS);

            panel.setLayout(box);
            panel.add(label);
            panel.setAlignmentX(Component.CENTER_ALIGNMENT);

            frame2.add(panel);
            frame2.setSize(300, 100);
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        else {
            String grouptxt = " (GROUP)";
            group = group + grouptxt;
            tempGroups.add(group);
            Twitter.pointer.setGroups(tempGroups);
            DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(group);
            Twitter.pointer.addToTree(newGroup);
            Twitter.pointer.addGroupNode(newGroup);
        }
    }

    // this add method is called when a node in the tree is selected
    // while the add button is clicked on. The only main difference
    // is that this method makes sure the new group is valid and places
    // them on the tree under the selected node
    public void addUnder(DefaultMutableTreeNode node, String group) {
        ArrayList<String> tempGroups = Twitter.pointer.getGroups();

        if (tempGroups.contains(group) || group == null || group.length() == 0) {

            JFrame frame2 = new JFrame("Error");
            JLabel label = new JLabel("This group ID already exists or is invalid.");

            JPanel panel = new JPanel(new BorderLayout(5, 5));
            BoxLayout box = new BoxLayout(panel, BoxLayout.X_AXIS);

            panel.setLayout(box);
            panel.add(label);
            panel.setAlignmentX(Component.CENTER_ALIGNMENT);

            frame2.add(panel);
            frame2.setSize(300, 100);
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        else {
            String grouptxt = " (GROUP)";
            group = group + grouptxt;
            tempGroups.add(group);
            Twitter.pointer.setGroups(tempGroups);
            DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(group);
            Twitter.pointer.addToSelectedGroup(node, newGroup);
            Twitter.pointer.addGroupNode(newGroup);
        }
    }
}
