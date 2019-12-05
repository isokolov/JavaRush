package com.javarush.task.task25.task2512;

import java.util.Stack;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        Stack<Throwable> exceptions = new Stack<>();
        exceptions.push(e);
        Throwable throwable = e.getCause();
        while (throwable != null) {
            exceptions.push(throwable);
            throwable = throwable.getCause();
        }
        while (!exceptions.empty())
        {
            Throwable currentException = exceptions.pop();
            System.out.println(currentException.getClass().getName() + ": " +currentException.getMessage());
        }
        /* LinkedList<Throwable> exceptions = new LinkedList<>();
        Throwable cursor = e;
        while (cursor != null) {
            exceptions.add(cursor);
            cursor = cursor.getCause();
        }
        while((cursor = exceptions.pollLast()) != null) {
            System.out.printf("%s: %s%n", cursor.getClass().getName(), cursor.getMessage());
        } */
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
