package com.command;

import java.util.ArrayList;
import java.util.List;

public class CommandUtils {

    /**
     * Recover the whole commands from file
     *
     * @param commandsFromFile commands
     * @return {@link List of commands}
     */
        public static List<Command> getCommandsFromFile(String commandsFromFile) {
            char[] commandsArray = commandsFromFile.toCharArray();
            List<Command> commands = new ArrayList<>();

            for (char character : commandsArray) {
                try {
                    Command command = CommandConst.valueOf(Character.toString(character)).getCommand();
                    commands.add(command);
                } catch (IllegalArgumentException e) {
                    throw new CommandException(String.format("COMMAND : Command %s does not exist", character));
                }
            }
            return commands;
        }
}
