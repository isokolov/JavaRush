package com.javarush.task.task32.task3206;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ItemInvocationHandler implements InvocationHandler {

    //private Item original;

    public ItemInvocationHandler() {
        //this.original = original;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return  method.invoke(this, args);
        //return null;
    }
}