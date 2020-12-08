
import javax.swing.tree.DefaultMutableTreeNode;

// this interface is implemented by AddUser and AddGroup to 
// follow the composite design pattern
public interface AddComponent {

    void add(String a);

    void addUnder(DefaultMutableTreeNode node, String a);

}
