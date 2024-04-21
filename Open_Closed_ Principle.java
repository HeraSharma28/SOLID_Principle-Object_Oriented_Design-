//****************************************************************
// Title : A java programme to demonstrate Open Close Principle.
// Author : Hera Sharma, Undergrduate student, Khulna University.
//****************************************************************

/**
 * Interface for message formatting.
 */
interface MessageFormatter {
    /**
     * Formats the given message.
     * 
     * @param message The message to be formatted.
     * @return The formatted message.
     */
    String format(Message message);
}

/**
 * Formats messages as plain text.
 */
class PlainTextFormatter implements MessageFormatter {
    @Override
    public String format(Message message) {
        return message.getContent();
    }
}

/**
 * Formats messages as HTML.
 */
class HtmlFormatter implements MessageFormatter {
    @Override
    public String format(Message message) {
        return "<p>" + message.getContent() + "</p>";
    }
}

// Main class for testing
public class OCPExample {
    public static void main(String[] args) {
        Message message = new Message("Hello, this is a message!");
        MessageFormatter formatter = new HtmlFormatter();
        String formattedMessage = formatter.format(message);
        System.out.println("Formatted message: " + formattedMessage);
    }
}

/**
 *  This code adheres to the Open/Closed Principle because it allows for extension without modification:
 * New formatters can be added without modifying existing code by implementing the MessageFormatter interface.
 */
