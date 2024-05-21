package com.labwork5;

/**
 * Menu item class.
 */
public class MenuItem {
    /**
     * Associated command.
     */
    private Command command;

    /**
     * Constructor.
     * @param command Associated command.
     */
    public MenuItem(Command command) {
        this.command = command;
    }

    /**
     * Click the menu item.
     */
    public void click() {
        command.execute();
    }

    /**
     * Get the associated command.
     * @param command Associated command.
     */
    public void setCommand(Command command) {
        this.command = command;
    }
}
