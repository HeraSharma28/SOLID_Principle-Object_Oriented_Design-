//*************************************************************************
// Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Hera Sharma, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Represents a message entity.
 */
class Message {
    private String content;

    /**
     * Constructs a message with the given content.
     * 
     * @param content The content of the message.
     */
    public Message(String content) {
        this.content = content;
    }

    /**
     * Gets the content of the message.
     * 
     * @return The content of the message.
     */
    public String getContent() {
        return content;
    }
}

/**
 * Represents a message service responsible for sending messages.
 */
class MessageService {
    /**
     * Sends the given message.
     * 
     * @param message The message to be sent.
     */
    public void sendMessage(Message message) {
        System.out.println("Sending message: " + message.getContent());
    }
}

// Main class for testing
public class SRPExample {
    public static void main(String[] args) {
        Message message = new Message("Hello, this is a message!");
        MessageService messageService = new MessageService();
        messageService.sendMessage(message);
    }
}

/**
 * This code adheres to the Single Responsibility Principle because each class has a single responsibility:
 * The Message class represents a message entity.
 * The MessageService class is responsible for sending messages.
 */

