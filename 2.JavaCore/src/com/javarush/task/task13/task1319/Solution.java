package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));

            while(true) {
                String line = reader.readLine();
                bufferedWriter.write(line + "\n");
                if (line.equals("exit")) {
                    break;
                }
            }

            reader.close();
            bufferedWriter.close();
        } catch (IOException exception) {}
    }
}
/* 66%, 1, 3.09, 18236 */