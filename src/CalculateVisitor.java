
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

//This class implements the Visitor interface and provides a pop up window
//for each visit method that calls one of the four created classes that all
//implement the TwitterComponents interface.
public class CalculateVisitor implements Visitor {

    @Override
    public void visitUserTotal(UserTotal userTotal) {
        JFrame frame2 = new JFrame("Total Users");
        JLabel label = new JLabel("Total Users in Current System: " + userTotal.getUserTotal());

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

    @Override
    public void visitGroupTotal(GroupTotal groupTotal) {
        JFrame frame2 = new JFrame("Total Groups");
        JLabel label = new JLabel("Total Groups in Current System: " + groupTotal.getGroupTotal());

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

    @Override
    public void visitMessageTotal(MessageTotal messageTotal) {
        JFrame frame2 = new JFrame("Total Tweets");
        JLabel label = new JLabel("Total Tweets in Current System: " + messageTotal.getMessageTotal());

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

    @Override
    public void visitPositiveMessages(PositiveMessages positiveMessages) {
        JFrame frame2 = new JFrame("Positive Tweet Percentage");
        JLabel label = new JLabel("Total Percentage of Positive Tweets: " + positiveMessages.getPositiveMessages());

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

}
