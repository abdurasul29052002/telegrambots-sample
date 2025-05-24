package uz.sonic.telegrambots_sample;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import uz.sonic.telegrambots.component.AbstractTelegramBot;
import uz.sonic.telegrambots.component.TelegramBotProperties;
import uz.sonic.telegrambots.service.BotService;

@Component
public class MyBot extends AbstractTelegramBot {

    protected MyBot(DefaultBotOptions options, TelegramBotProperties properties, BotService service) {
        super(options, properties, service);
    }
}
