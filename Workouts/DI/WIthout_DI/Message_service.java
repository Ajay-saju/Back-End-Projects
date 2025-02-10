package WIthout_DI;

// Let's say you have a MessageService that sends messages, and a UserService that depends on the MessageService to send notifications.

// Without Dependency Injection:

class Message_Service {
    void sendMessage(String message) {
        System.out.println("Sending message:  " + message);
    }
}