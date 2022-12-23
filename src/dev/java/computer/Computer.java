package dev.java.computer;

public class Computer {
    private String name = "Apple";
    // added constructors empty and string
    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // added getter and setter methods

    public void on(){
        System.out.println("The method is on for " + name);
    }
    public void off(){
        System.out.println("The method is off for " + name);
    }
}
