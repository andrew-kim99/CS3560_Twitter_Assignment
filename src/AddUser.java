
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

//This class implements the AddComponent interface as per the 
//composite design pattern. This class also handles errors to
//ensure that users will always be treated as leaf nodes in the tree.

public class AddUser implements AddComponent {

    // pointer instance to be referenced when accessing class's methods
    public static AddUser pointer = new AddUser();

    // private constructor following Singleton pattern to ensure only
    // one instance being run at a time
    private AddUser() {

    }

    // This add method is called when a specific node in the tree is not selected
    // and a user is simply added, most likely in the beginning stages of the test
    // run.
    // There is a if-else statement to ensure if the user ID exists, or is
    // null/empty
    public void add(String user) {
        ArrayList<String> tempUsers = Twitter.pointer.getUsers();
        ArrayList<Long> tempTime = Twitter.pointer.getUserTime();
        ArrayList<Long> tempUpdate = Twitter.pointer.getUpdatedTime();

        int counter = Twitter.pointer.getUserCounter();

        tempUpdate.add((long) 0);
        User user1 = new User();
        Twitter.pointer.addToUsersSubject(user1);
        Follower observer = new Follower();
        Twitter.pointer.addToFollower(observer);
        counter++;
        Twitter.pointer.setUserCounter(counter);
        tempUsers.add(user);
        tempTime.add(System.currentTimeMillis());
        Twitter.pointer.setUserTime(tempTime);
        Twitter.pointer.setUsers(tempUsers);
        DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(user);
        Twitter.pointer.addToTree(newUser);

        // this chunk ensures that any new user is an observer of itself
        // so that any of their tweets will be included in their own feed
        ArrayList<String> temp = Twitter.pointer.getUsers();
        int holder = temp.indexOf(user);
        ArrayList<User> tempUser = Twitter.pointer.getUsersSubject();
        ArrayList<Follower> tempFollower = Twitter.pointer.getFollower();
        tempUser.get(holder).registerObserver(tempFollower.get(holder));
        Twitter.pointer.setUsersSubject(tempUser);
        Twitter.pointer.setFollower(tempFollower);

        ArrayList<DefaultListModel> models = Twitter.pointer.getModels();
        DefaultListModel model = new DefaultListModel();
        models.add(model);
        Twitter.pointer.setModels(models);
        ArrayList<User> usersSub = Twitter.pointer.getUsersSubject();
        ArrayList<Follower> followerObs = Twitter.pointer.getFollower();
        User a = new User();
        Follower b = new Follower();
        usersSub.add(a);
        followerObs.add(b);
        Twitter.pointer.setUsersSubject(usersSub);
        Twitter.pointer.setFollower(followerObs);

    }

    // this add method is called when a node in the tree is selected
    // while the add button is clicked on. The only main difference
    // is that this method makes sure the new user is valid and places
    // them on the tree under the selected node
    public void addUnder(DefaultMutableTreeNode node, String user) {
        ArrayList<String> tempUsers = Twitter.pointer.getUsers();
        ArrayList<Long> tempTime = Twitter.pointer.getUserTime();
        ArrayList<Long> tempUpdate = Twitter.pointer.getUpdatedTime();

        int counter = Twitter.pointer.getUserCounter();

        tempUpdate.add((long) 0);
        counter++;
        Twitter.pointer.setUserCounter(counter);
        tempUsers.add(user);
        tempTime.add(System.currentTimeMillis());
        Twitter.pointer.setUserTime(tempTime);
        Twitter.pointer.setUsers(tempUsers);
        DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(user);
        Twitter.pointer.addToSelectedGroup(node, newUser);

        // this chunk ensures that any new user is an observer of itself
        // so that any of their tweets will be included in their own feed
        ArrayList<String> temp = Twitter.pointer.getUsers();
        int holder = temp.indexOf(user);
        ArrayList<User> tempUser = Twitter.pointer.getUsersSubject();
        ArrayList<Follower> tempFollower = Twitter.pointer.getFollower();
        tempUser.get(holder).registerObserver(tempFollower.get(holder));
        Twitter.pointer.setUsersSubject(tempUser);
        Twitter.pointer.setFollower(tempFollower);

        ArrayList<DefaultListModel> models = Twitter.pointer.getModels();
        DefaultListModel model = new DefaultListModel();
        models.add(model);
        Twitter.pointer.setModels(models);
        ArrayList<User> usersSub = Twitter.pointer.getUsersSubject();
        ArrayList<Follower> followerObs = Twitter.pointer.getFollower();
        User a = new User();
        Follower b = new Follower();
        usersSub.add(a);
        followerObs.add(b);
        Twitter.pointer.setUsersSubject(usersSub);
        Twitter.pointer.setFollower(followerObs);

    }
}
