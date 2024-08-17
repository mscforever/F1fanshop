package edu.shop.f1fan.controller;

import java.util.HashMap;
import java.util.Map;

import edu.shop.f1fan.controller.impl.AddGoodCommand;
import edu.shop.f1fan.controller.impl.DeleteGoodByTypeCommand;
import edu.shop.f1fan.controller.impl.FindGoodByTeamCommand;
import edu.shop.f1fan.controller.impl.FindGoodByTypeCommand;
import edu.shop.f1fan.controller.impl.FindGoodByPriceCommand;
import edu.shop.f1fan.controller.impl.FindGoodBySizeCommand;
import edu.shop.f1fan.controller.impl.NoSuchCommand;

public class CommandProvider {
    
	private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.ADD, new AddGoodCommand());
        repository.put(CommandName.FIND_TYPE, new FindGoodByTypeCommand());
        repository.put(CommandName.FIND_TEAM, new FindGoodByTeamCommand());
        repository.put(CommandName.FIND_SIZE, new FindGoodBySizeCommand());
        repository.put(CommandName.FIND_PRICE, new FindGoodByPriceCommand());
        repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand()); 
        repository.put(CommandName.DELETE_TYPE, new DeleteGoodByTypeCommand());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}