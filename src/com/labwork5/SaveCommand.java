package com.labwork5;

/**
 * Save command class.
 */
public class SaveCommand implements Command {
    /**
     * Document to save.
     */
    private Document document;

    /**
     * Constructor.
     * @param document Document to save.
     */
    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
