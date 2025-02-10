package With_DI;


// Step 2: Implement the Dependency

public class Email_Service implements Message_Service{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email :  "+ message);
    }
    

}
