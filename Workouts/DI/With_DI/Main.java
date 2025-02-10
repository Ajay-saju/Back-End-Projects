package With_DI;

public class Main {
    public static void main(String[] args) {
        
        // Inject the dependency (EmailService) into UserService

        Message_Service EmailService = new Email_Service();
        User_service user_service = new User_service(EmailService);
        user_service.notifyUser("Alice");


        // Inject a different dependency (SMSService) into UserService

        Message_Service smsService = new SMS_Service();
        User_service user_service2 = new User_service(smsService);
        user_service2.notifyUser("Ajay");

    }
}
