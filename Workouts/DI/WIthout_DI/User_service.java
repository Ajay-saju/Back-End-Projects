package WIthout_DI;

public class User_service {

    private Message_Service messageService = new Message_Service();

    // here dependecy is created internally 
    
    void notifyUser(String user){
          messageService.sendMessage("Hello,  "+ user);
    }
}
