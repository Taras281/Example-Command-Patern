package org.example.commands;

import org.example.Troop;

public class Left implements Command{
    private Troop troop;

    public Left(Troop troop) {
        this.troop = troop;
    }

    @Override
    public void execute() {
        troop.left();
    }
}
