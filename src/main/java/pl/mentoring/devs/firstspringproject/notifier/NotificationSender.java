package pl.mentoring.devs.firstspringproject.notifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.service.MessagingService;
import pl.mentoring.devs.firstspringproject.utils.Logger;

@Component
public class NotificationSender {
    private final MessagingService messagingService;
    private final Logger logger;

    public NotificationSender(MessagingService messagingService, @Qualifier("debugLogger") Logger logger) {
        this.messagingService = messagingService;
        this.logger = logger;
    }

    public void sendReminder() {
        logger.log("Sending reminder to user.");
        messagingService.send();
    }
}
