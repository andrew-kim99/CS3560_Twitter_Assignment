import java.util.ArrayList;

//This class will traverse through the system's messages ArrayList from
//the Twitter class and keep track of the amount of messages that 
//contain one of the four designated positive words: good, great, awesome, 
// or cool. After it checks through every message, it will set the positiveMessages
// float to positiveMessages/messageTotal to get the percentage
public class PositiveMessages implements TwitterComponents {

    private float positiveMessages;

    public PositiveMessages() {
        ArrayList<String> temp = Twitter.pointer.getMessages();
        float messageTotal = temp.size();
        float positiveTotal = 0;

        for (int i = 0; i < messageTotal; i++) {
            if (temp.get(i).contains("good") || temp.get(i).contains("great") || temp.get(i).contains("cool")
                    || temp.get(i).contains("awesome")) {
                positiveTotal++;
            }
        }

        if (positiveTotal > 0) {
            setPositiveMessages((positiveTotal / messageTotal));
        }

    }

    public float getPositiveMessages() {
        return this.positiveMessages;
    }

    public void setPositiveMessages(float positiveMessages) {
        this.positiveMessages = positiveMessages;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPositiveMessages(this);
    }
}
