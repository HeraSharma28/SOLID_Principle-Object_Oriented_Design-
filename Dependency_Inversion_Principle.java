//************************************************************************
// Title : A java programme to demonstrate Dependency Inversion Principle.
// Author : Hera Sharma, Undergrduate student, Khulna University.
//************************************************************************

/**
 * Interface for message repository.
 */
interface MessageRepository {
    /**
     * Saves the given message.
     * 
     * @param message The message to be saved.
     */
    void save(Message message);
}

/**
 * Saves messages to a database.
 */
class DatabaseMessageRepository implements MessageRepository {
    @Override
    public void save(Message message) {
        System.out.println("Saving message to database: " + message.getContent());
    }
}

/**
 * Manages message operations.
 */
class MessageManager {
    private MessageRepository messageRepository;

    /**
     * Constructs a MessageManager with the specified repository.
     * 
     * @param messageRepository The repository to be used for saving messages.
     */
    public MessageManager(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /**
     * Saves the given message using the configured repository.
     * 
     * @param message The message to be saved.
     */
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}

// Main class for testing
public class DIPExample {
    public static void main(String[] args) {
        Message message = new Message("Hello, this is a message!");
        MessageRepository repository = new DatabaseMessageRepository();
        MessageManager manager = new MessageManager(repository);
        manager.saveMessage(message);
    }
}

/**
 * This code adheres to the Dependency Inversion Principle because it depends on abstractions rather than concrete implementations: 
 * The MessageManager class depends on abstractions (MessageRepository) rather than concrete implementations, promoting loose coupling and easier changes.
 */
