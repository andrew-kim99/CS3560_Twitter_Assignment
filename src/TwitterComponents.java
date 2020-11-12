//This interface ensures that the UserTotal, GroupTotal, MessageTotal, 
//and PositiveMessages classes all implement an accept method to be accessed from 
//the Twitter class when their corresponding button is pressed
public interface TwitterComponents {
    public void accept(Visitor visitor);
}
