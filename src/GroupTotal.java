
//this class contains the groupTotal variable, which the size of the 
//groups ArrayList from the Twitter class. As more groups are added
//to the system, this class will contain the number of total groups
//when it is called upon
public class GroupTotal implements TwitterComponents {
    private int groupTotal = Twitter.pointer.getGroups().size();

    public int getGroupTotal() {
        return this.groupTotal;
    }

    public void setGroupTotal(int groupTotal) {
        this.groupTotal = groupTotal;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGroupTotal(this);
    }
}
