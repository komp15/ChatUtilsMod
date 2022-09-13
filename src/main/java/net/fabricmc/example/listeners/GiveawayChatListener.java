package net.fabricmc.example.listeners;

import net.fabricmc.example.commands.GiveawayCommand;
import net.minecraft.text.Text;

public class GiveawayChatListener implements ChatListener{

    private String password;
    private GiveawayCommand command;

    public GiveawayChatListener(String password, GiveawayCommand giveawayCommand) {
        this.password = password;
        this.command = giveawayCommand;
    }

    @Override
    public void processMessage(Text message) {
        command.passMessage(message);
    }
}
