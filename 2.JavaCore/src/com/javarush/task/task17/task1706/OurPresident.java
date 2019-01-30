package com.javarush.task.task17.task1706;

/* Only one thread gets an access to all static class synchronized (Myclass.class) */
public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class) {
            if (president == null) {
                president = new OurPresident();
            }

        }
    }
}
