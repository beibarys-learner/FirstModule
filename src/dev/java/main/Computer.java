package dev.java.main;

public class Computer implements IComputer {

    private String name;
    private IMonitor monitor;

    public Computer(String name, IMonitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public Computer() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void on() {
        System.out.println("Computer is on " + name + " using monitor is " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Computer is off " + name + " using monitor is " + monitor.getName());
    }
}
