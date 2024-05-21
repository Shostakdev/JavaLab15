package com.labwork5;

/**
 * Toolbar button class.
 */
public class ToolbarButton {
    /**
     * Command to execute.
     */
    private Command command;

    /**
     * Constructor.
     * @param command Command to execute.
     */
    public ToolbarButton(Command command) {
        this.command = command;
    }

    /**
     * Click the toolbar button.
     */
    public void click() {
        command.execute();
    }

    /**
     * Set the command to execute.
     * @param command Command to execute.
     */
    public void setCommand(Command command) {
        this.command = command;
    }
}
