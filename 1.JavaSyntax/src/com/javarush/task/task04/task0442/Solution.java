package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
Подсказака: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                sum += number;
                break;
            }
            sum += number;
        }
        System.out.println(sum);
        /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int sum = 0;
        while (a!=-1) {
            a = Integer.parseInt(br.readLine());
            sum += a;
        }
        System.out.println(sum); */
    }
}