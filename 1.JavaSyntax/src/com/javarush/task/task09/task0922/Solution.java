package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /* started */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDate = reader.readLine();
        Date date = new Date(Integer.parseInt(inputDate.substring(0,4)),
                Integer.parseInt(inputDate.substring(5,7)), Integer.parseInt(inputDate.substring(9,10)));
        DateFormat df = new SimpleDateFormat("MM dd, yyyy", Locale.ENGLISH);
        System.out.println(df.format(date));
    }

}
