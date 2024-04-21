//*************************************************************************
// Title : A java programme to demonstrate Interface Segregation Principle.
// Author : Hera Sharma, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Interface for message sending actions.
 */
interface MessageSenderAction {
    /**
     * Sends the given message.
     * 
     * @param message The message to be sent.
     */
    void send(Message message);
}

/**
 * Interface for message formatting actions.
 */
interface MessageFormatterAction {
    /**
     * Formats the given message.
     * 
     * @param message The message to be formatted.
     * @return The formatted message.
     */
    String format(Message message);
}

/**
 * Represents a message service that combines sending and formatting actions.
 */
class MessageService implements MessageSenderAction, MessageFormatterAction {
    @Override
    public void send(Message message) {
        System.out.println("Sending message: " + message.getContent());
    }

    @Override
    public String format(Message message) {
        return message.getContent();
    }
}

// Main class for testing
public class ISPExample {
    public static void main(String[] args) {
        Message message = new Message("Hello, this is a message!");
        MessageService service = new MessageService();
        service.send(message);
    }
}

/**
 * This code adheres to the Interface Segregation Principle because it promotes interface segregation:
 * Clients can depend only on the interface they need (MessageSenderAction or MessageFormatterAction), reducing unnecessary dependencies.
 */
