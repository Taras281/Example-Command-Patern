package org.example.commands;

import org.example.Troop;
import org.example.commands.Command;

public class Quit implements Command {
    private Troop troop;

    public Quit(Troop troop) {
        this.troop = troop;
    }

    @Override
    public void execute() {
        troop.quit();
    }
}
