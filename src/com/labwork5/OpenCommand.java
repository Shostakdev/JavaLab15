package com.labwork5;

/**
 * Open command class.
 */
public class OpenCommand implements Command {
    /**
     * Document to open.
     */
    private Document document;

    /**
     * Constructor.
     * @param document Document to open.
     */
    public OpenCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}

