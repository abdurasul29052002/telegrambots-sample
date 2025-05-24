package uz.sonic.telegrambots_sample;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.sonic.telegrambots.messages.AutoSendMessage;
import uz.sonic.telegrambots.service.BotService;

@Component
@Slf4j
public class MyBotService implements BotService {

    private final AutoSendMessage sendMessage;

    public MyBotService(AutoSendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    @Override
    public void onUpdateReceived(Update update) {
        sendMessage.setText("Hello, this is a test message from MyBotService!");
        log.info("Received update: {}", update.getUpdateId());
    }
}
