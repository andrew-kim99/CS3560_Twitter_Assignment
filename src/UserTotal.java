
//this class contains the userTotal variable, which the size of the 
//users ArrayList from the Twitter class. As more users are added
//to the system, this class will contain the number of total users
//when it is called upon
public class UserTotal implements TwitterComponents {
    private int userTotal = Twitter.pointer.getUsers().size();

    public int getUserTotal() {
        return this.userTotal;
    }

    public void setUserTotal(int userTotal) {
        this.userTotal = userTotal;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitUserTotal(this);
    }

}
