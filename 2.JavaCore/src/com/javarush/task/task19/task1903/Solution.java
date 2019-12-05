package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {



    }

    public static class IncomeDataAdapter implements Contact, Customer {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }


        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            int number = data.getPhoneNumber();
            int numberLength = String.valueOf(data.getPhoneNumber()).length();
            String newNumber = String.valueOf(number);
            while(numberLength < 10) {
                newNumber = "0" + newNumber;
                numberLength++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+").append(data.getCountryPhoneCode()).append("(");
            stringBuilder.append(newNumber.substring(0, 3)).append(")");
            stringBuilder.append(newNumber.substring(3, 6)).append("-");
            stringBuilder.append(newNumber.substring(6, 8)).append("-").append(newNumber.substring(8, 10));

            return stringBuilder.toString();
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
