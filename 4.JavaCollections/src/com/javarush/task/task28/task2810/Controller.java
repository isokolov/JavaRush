package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void scan() {
        List<Vacancy> vacancies = new ArrayList<Vacancy>();
        try {
            for (Provider provider : providers) {
                vacancies.addAll(provider.getJavaVacancies("java"));
            }
            System.out.println(vacancies.size());
        }
        catch (NullPointerException ignore) {
        }
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }
}
