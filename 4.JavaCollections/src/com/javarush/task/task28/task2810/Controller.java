package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;

import java.util.Arrays;

public class Controller {

    private Provider[] providers;

    public Controller(Provider... providers) {
        boolean providersEmpty = true;
        for(Provider provider: providers) {
            if (provider != null) {
                providersEmpty = false;
            }
        }
        if (providersEmpty) {
            throw new IllegalArgumentException();
        }
        this.providers = providers;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }
}
