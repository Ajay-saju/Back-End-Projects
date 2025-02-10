package WIthout_DI;

public class Main {
    public static void main(String[] args) {
        User_service userService = new User_service();
        userService.notifyUser("Alice");
    }
}

// In this example,

// UserService directly
// creates an
// instance of
// MessageService.This tightly
// couples the
// two classes, making
// it harder
// to test
// or replace MessageService
