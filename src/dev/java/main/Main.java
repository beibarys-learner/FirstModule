package dev.java.main;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Macbook", new Monitor("Samsung Monitor"));
        comp.on();
        comp.off();
    }
}