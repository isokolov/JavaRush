package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {

    Thread controlThread;

    public LoggingStateThread(Thread thread) {
        controlThread = thread;
        //System.out.println(controlThread.getState());
        controlThread.setDaemon(true);
        //controlThread.interrupt();
    }

    @Override
    public void run() {
        State state, lastState = null;
        do {
            state = controlThread.getState();
            if (state != lastState) {
                System.out.println(state);
                lastState = state;
            }
        } while (state != State.TERMINATED);
        /*if(!controlThread.isInterrupted()) {
            System.out.println(getState());
        }*/
        /*if (.getState() == State.TERMINATED ) {
            System.out.println(getState());
        }*/
    }
}
