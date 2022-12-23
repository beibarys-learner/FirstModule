package dev.java;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("The computer's name equals to " + computer.name);
        computer.on();
        computer.off();
    }
}