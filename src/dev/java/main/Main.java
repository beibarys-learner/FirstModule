package dev.java.main;

import dev.java.computer.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("HP");
//        computer.setName("HP") using setter or constructor - we changed Apple to HP
        computer.on();
        computer.off();
    }
}