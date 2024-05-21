package com.labwork5;

/**
 * Main class.
 */
public class Main {
    /**
     * Main method.
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        Document document = new Document();

        Command openCommand = new OpenCommand(document);
        Command saveCommand = new SaveCommand(document);

        MenuItem openMenuItem = new MenuItem(openCommand);
        ToolbarButton saveToolbarButton = new ToolbarButton(saveCommand);

        openMenuItem.click(); // Output: Document opened.
        saveToolbarButton.click(); // Output: Document saved.

        // Create a macro command
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(openCommand);
        macroCommand.addCommand(saveCommand);

        MenuItem macroMenuItem = new MenuItem(macroCommand);
        macroMenuItem.click(); // Output: Document opened. Document saved.
    }
}