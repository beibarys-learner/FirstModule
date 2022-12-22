package dev.java;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer2 = new Computer();
        System.out.println("Computer's name is " + computer.name);
        System.out.println("Computer's system is " + computer.system);
        System.out.println("Computer's system is " + computer.system);
        System.out.println("Computer's system is " + computer2.system);
        computer.printVersion();
    }
}