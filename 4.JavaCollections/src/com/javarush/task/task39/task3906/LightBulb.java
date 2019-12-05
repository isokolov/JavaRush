package com.javarush.task.task39.task3906;

/*public class LightBulb {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    void turnOff() {
        System.out.println("The light is off!");
        on = false;
    }

    void turnOn() {
        System.out.println("The light is on!");
        on = true;
    }
}*/

public class LightBulb implements Switchable {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void turnOff() {
        System.out.println("The light is shining!");
        on = false;
    }

    public void turnOn() {
        System.out.println("The light has been turned off!");
        on = true;
    }
}
