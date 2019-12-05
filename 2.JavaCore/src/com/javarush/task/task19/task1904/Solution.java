package com.javarush.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("hhhh"));
        PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
        Person person = adapter.read();
        System.out.println(person);
        Person person2 = adapter.read();
        System.out.println(person2);

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            Person person = null;
            if (fileScanner.hasNext()) {
                String personDate = fileScanner.nextLine();
                String[] pers = personDate.split(" ");
                Calendar calendar = new GregorianCalendar(Integer.parseInt(pers[5]),
                        Integer.parseInt(pers[4]) - 1, Integer.parseInt(pers[3]));

                person = new Person(pers[1], pers[2], pers[0], calendar.getTime());
                //System.out.println(person);
            }

            return person;


            /*String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            String lastName = fileScanner.next();
            int day = fileScanner.nextInt();
            int month = fileScanner.nextInt() - 1;
            int year = fileScanner.nextInt();
            Date date = new Date(year, month, day);
            //SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            DateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Person person = null;
            try {
                Date birthdate =  sdf.parse(day + " " + month + " " + year);
                System.out.println(birthdate);
                person = new Person(firstName, middleName, lastName, birthdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }*/
            /*GregorianCalendar calendar = new GregorianCalendar(year, month, day);
            Date date = calendar.getTime();
            Person person = new Person(firstName, middleName, lastName, date);*/

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
