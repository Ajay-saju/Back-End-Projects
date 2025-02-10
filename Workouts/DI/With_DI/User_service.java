package With_DI;

public class User_service {
    private Message_Service messageService;

    // constructor Injection

    User_service(Message_Service mService) {

        this.messageService = mService;

    }

    void notifyUser(String user) {
        messageService.sendMessage("Hello  :  " + user);
    }
}
