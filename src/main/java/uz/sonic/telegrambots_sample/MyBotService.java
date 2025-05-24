package uz.sonic.telegrambots_sample;


import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.sonic.telegrambots.messages.AutoSendMessage;
import uz.sonic.telegrambots.service.BotService;

@Component
public class MyBotService implements BotService {

    private final AutoSendMessage sendMessage;

    public MyBotService(AutoSendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("Received update: " + update);
        sendMessage.setText("Hello, this is a test message!");
    }
}
