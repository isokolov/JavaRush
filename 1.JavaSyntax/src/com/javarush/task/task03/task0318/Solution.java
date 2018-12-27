package com.javarush.task.task03.task0318;

/* 
План по захвату мира
Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш кодI
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        /*Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = scanner.nextInt();*/


        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
