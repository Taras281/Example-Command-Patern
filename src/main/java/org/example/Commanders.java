package org.example;

import org.example.commands.Command;

import java.util.HashMap;

public class Commanders {
    HashMap<String, Command> commandHashMap = new HashMap<>();
    public void registerCommand(String name, Command command){
        commandHashMap.put(name,command);
    }
    public void execute(String name) throws MyException {
        if(commandHashMap.get(name)==null) {
            System.out.println("no command");
            throw new MyException("no command" + name);
        }
        else
            commandHashMap.get(name).execute();
    }
}
