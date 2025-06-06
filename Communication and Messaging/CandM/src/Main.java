import java.util.*;


class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        if (content == null || sender == null || recipient == null) {
            throw new IllegalArgumentException("content, sender, recipient must not be null");
        }
        this.content = content.trim();
        this.sender = sender.trim();
        this.recipient = recipient.trim();
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSummary() {
        return "From: " + sender + ", To: " + recipient + ", Content: " + content;
    }

    public String getDetails() {
        return String.format("""
                Content: %s
                Sender: %s
                Recipient: %s
                Content Length: %d
                Sender Uppercase: %s
                Recipient Lowercase: %s
                """,
                content, sender, recipient,
                content.length(),
                sender.toUpperCase(),
                recipient.toLowerCase()
        );
    }
}


class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        String normalizedRecipient = recipient.trim().toLowerCase();
        inbox.computeIfAbsent(normalizedRecipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return new ArrayList<>(inbox.getOrDefault(recipient.trim().toLowerCase(), Collections.emptyList()));
    }

    public void printAllMessages() {
        for (Map.Entry<String, List<Message>> entry : inbox.entrySet()) {
            System.out.println("==> Coming message " + entry.getKey() + ":");
            for (Message message : entry.getValue()) {
                System.out.println(message.getSummary());
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

       
        service.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        service.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        service.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

       
        List<Message> tenantMessages = service.getMessagesForRecipient("tenant a");
        System.out.println("---- Tenant A's message ----");
        for (Message m : tenantMessages) {
            System.out.println(m.getSummary());
        }

        
        Message example = new Message("Test message", "Sender", "Recipient");
        
        System.out.println(example.getDetails());

        
        service.printAllMessages();
    }
}
