package com.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Macro command class.
 */
public class MacroCommand implements Command {
    /**
     * List of commands.
     */
    private List<Command> commands = new ArrayList<>();

    /**
     * Add a command to the list of commands.
     * @param command Command to add.
     */
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
