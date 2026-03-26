class Notifier {

    public void send(String message) {
        System.out.println("General Alert: " + message);
    }

    protected void send(String message, String email) {
        System.out.println("Email to " + email + ": " + message);
    }

    void send(String message, long phoneNumber) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }

    private void send(String message, String email, long phoneNumber) {
        System.out.println("Internal Log - Message: " + message + ", Email: " + email + ", Phone: " + phoneNumber);
    }

    public void triggerInternalNotification(String message, String email, long phoneNumber) {
        send(message, email, phoneNumber);
    }
}

class AppNotifier extends Notifier {

    public void testNotifications() {
        send("System update available");
        
        send("Your invoice is ready", "user@example.com");
        
        send("Your OTP is 4582", 9876543210L);
        
        triggerInternalNotification("Security breach detected", "admin@company.com", 1122334455L);
    }
}

public class Q3 {
    public static void main(String[] args) {
        AppNotifier appNotifier = new AppNotifier();
        appNotifier.testNotifications();
    }
}