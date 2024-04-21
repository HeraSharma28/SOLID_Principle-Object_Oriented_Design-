//***********************************************************************
// Title : A java programme to demonstrate Liskov Substitution Principle.
// Author : Hera Sharma, Undergrduate student, Khulna University.
//***********************************************************************

/**
 * Represents a base class for sending messages.
 */
abstract class MessageSender {
    /**
     * Sends the given message.
     * 
     * @param message The message to be sent.
     */
    public abstract void sendMessage(Message message);
}

/**
 * Sends messages via email.
 */
class EmailSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Sending email: " + message.getContent());
    }
}

/**
 * Sends messages via SMS.
 */
class SmsSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Sending SMS: " + message.getContent());
    }
}

// Main class for testing
public class LSPExample {
    public static void main(String[] args) {
        Message message = new Message("Hello, this is a message!");
        MessageSender sender = new EmailSender();
        sender.sendMessage(message);
    }
}

/**
 * This code adheres to the Liskov Substitution Principle because it allows subclasses to be used interchangeably:
 * The EmailSender and SmsSender subclasses can be used interchangeably with the MessageSender superclass without affecting behavior.
 */
