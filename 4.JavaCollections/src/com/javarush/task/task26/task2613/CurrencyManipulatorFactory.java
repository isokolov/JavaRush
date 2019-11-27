package com.javarush.task.task26.task2613;

import java.util.Map;

public abstract class CurrencyManipulatorFactory {

    private static Map<String, CurrencyManipulator> map;

    private CurrencyManipulatorFactory() {}

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        return null;
    }
}
