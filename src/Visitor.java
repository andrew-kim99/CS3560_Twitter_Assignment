//this interface ensures that CalculateVisitor implements a visit method
//for each of the four class types. 
public interface Visitor {

    public void visitUserTotal(UserTotal userTotal);

    public void visitGroupTotal(GroupTotal groupTotal);

    public void visitMessageTotal(MessageTotal messageTotal);

    public void visitPositiveMessages(PositiveMessages positiveMessages);

}
