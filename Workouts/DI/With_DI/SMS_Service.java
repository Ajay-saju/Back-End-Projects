package With_DI;


// Step 2: Implement the Dependency

public class SMS_Service implements Message_Service {

    @Override
    public void sendMessage(String message) {
        System.out.println("sending messages :  "+ message);
    }
    
}
