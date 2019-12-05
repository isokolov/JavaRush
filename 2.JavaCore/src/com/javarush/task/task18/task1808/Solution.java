package com.javarush.task.task18.task1808;

/* 
Разделение файла
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);
        byte[] buffer = new byte[inputStream.available()];
        /* 1 attempt
        int lengthFile = 0;
        if (inputStream.available() % 2 == 0) {
            lengthFile = inputStream.available() / 2;
        } else  {
            lengthFile = inputStream.available() / 2 + 1;
        }*/
        int lengthFile = inputStream.available();
        /*  2 attempt
        int bufferPart1 = lengthFile / 2;
        */
        /* 3 attempt algorithm for bufferPart1 */
        int bufferPart1 = 0;
        if (lengthFile % 2 == 0) {
             bufferPart1 = lengthFile / 2;
        } else {
            bufferPart1 = lengthFile / 2 + 1;
        }
        if (inputStream.available() > 0) {
            int data = inputStream.read(buffer);
            outputStream1.write(buffer, 0, bufferPart1);
            /* 1 attempt
            outputStream2.write(buffer, lengthFile, lengthFile - 1);
            */
            if (lengthFile % 2 == 0) {
                outputStream2.write(buffer, bufferPart1, bufferPart1);
            }
            else {
                outputStream2.write(buffer, bufferPart1, bufferPart1 - 1);
            }
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
