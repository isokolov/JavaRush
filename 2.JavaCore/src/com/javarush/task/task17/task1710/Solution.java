package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        //create person
        if (args[0].startsWith("-c")) {
            Date date = null;
            try {
                date = dateFormat.parse(args[3]);
            } catch (ParseException e) {
                e.getMessage();
            }

            //VALIDATOR: При запуске программы с параметром -с программа должна добавлять человека с заданными
            // параметрами в конец списка allPeople, и выводить id (index) на экран.
            if (args[2].startsWith("м")) {
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        }

        //update person
        if (args[0].startsWith("-u")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            //update name
            person.setName(args[2]);

            //udate date
            Date date = null;
            try {
                date = dateFormat.parse(args[4]);
            } catch (ParseException e) {
                e.getMessage();
            }
            person.setBirthDate(date);

            //update sex
            if (args[3].startsWith("м"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }

        //remove person
        if (args[0].startsWith("-d")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        //print person
        if (args[0].startsWith("-i")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            StringBuffer s = new StringBuffer();
            s.append(person.getName());
            s.append(" ");
            s.append(person.getSex() == Sex.MALE ? "м" : "ж");
            s.append(" ");
            s.append(dateFormatPrt.format(person.getBirthDate()));
            System.out.println(s);
        }
    }
}
        //start here - начни тут
        //String parameters = "-c Миронов м 15/04/1990"; //args[0];
        //String parameters = "-i 1";
        /*String parameters = args[0];
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String[] params = parameters.split(" ");
        try {
            if (params[0].equals("-c")) {
                Date date = new Date(Integer.parseInt(params[3].substring(6,10)) - 1900,
                        Integer.parseInt(params[3].substring(3,5)) - 1, Integer.parseInt(params[3].substring(0,2)));
                if (params[2].equals("м")) {
                    //System.out.println(dateFormat.format(date));
                    allPeople.add(Person.createMale(params[1], dateFormat.parse(dateFormat.format(date))));
                }
                if (params[2].equals("ж")) {
                    allPeople.add(Person.createFemale(params[1], dateFormat.parse(dateFormat.format(date))));
                }
            }
            if (params[0].equals("-u")) {
                int myId = Integer.parseInt(params[1]);
                for (Person person: allPeople) {
                    if (person.getId() == myId) {
                        person.setName(params[2]);
                        if (params[3].equals("м"))
                            person.setSex(Sex.MALE);
                        if (params[3].equals("ж"))
                            person.setSex(Sex.FEMALE);
                        Date date = new Date(Integer.parseInt(params[4].substring(6,10)) - 1900,
                                Integer.parseInt(params[4].substring(3,5)) - 1, Integer.parseInt(params[4].substring(0,2)));
                        person.setBirthDate(dateFormat.parse(dateFormat.format(date)));


                    }
                }
            }
            if (params[0].equals("-d")) {
                int myId = Integer.parseInt(params[1]);
                for (Person person: allPeople) {
                    if (person.getId() == myId) {
                        person.setBirthDate(null);
                        person.setName(null);
                        person.setSex(null);
                    }
                }
            }
            if (params[0].equals("-i")) {
                int myId = Integer.parseInt(params[1]);
                char sex = ' ';
                for (Person person: allPeople) {
                    if (person.getId() == myId) {
                        if(person.getSex().equals(Sex.MALE)) {
                            sex = 'м';
                        } else sex = 'ж';
                        System.out.println(person.getName() + " " + sex + " " + dateFormat.format(person.getBirthDate()));
                    }
                }
            }

        } catch (ParseException exc) {
            exc.printStackTrace();
        }

        for (Person person: allPeople) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }
    }
}*/
