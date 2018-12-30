package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        int maxSequence = 1;
        int actualSequence = 1;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).intValue() == arrayList.get(i + 1).intValue())
                actualSequence++;
            if (arrayList.get(i).intValue() != arrayList.get(i + 1).intValue() && actualSequence > maxSequence) {
                maxSequence = actualSequence;
                actualSequence = 1;
            }

            if (arrayList.get(i).intValue() != arrayList.get(i + 1).intValue() && actualSequence <= maxSequence) {
                actualSequence = 1;
            }

        }
        if (actualSequence > maxSequence) {
            maxSequence = actualSequence;
        }

        System.out.println(maxSequence);

    }
}
