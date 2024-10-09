package org.example;

import org.example.commands.Command;
import org.example.commands.Left;
import org.example.commands.Quit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Commanders commanders = new Commanders();
        Troop troop = new Troop();
        Command right = troop::right;
        Command easy = troop::easy;
        Command left = new Left(troop);
        Command quit = new Quit(troop);
        commanders.registerCommand("right", right);
        commanders.registerCommand("left", left);
        commanders.registerCommand("quit", quit);
        commanders.registerCommand("easy", easy);
        try {
            commanders.execute("no command");
        }
        catch (MyException m){
            System.out.println(m);
        }
        try {
            commanders.execute("quit");
            commanders.execute("right");
            commanders.execute("left");
            commanders.execute("easy");
        }
        catch (MyException m){
            System.out.println(m);
        }


    }
}