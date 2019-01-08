package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
Расставь модификаторы static так, чтобы пример скомпилировался.
4. Метод main не изменять.
5. Метод getA не изменять.
6. В классе должно быть 3 статических поля.
*/

public class Solution {
    public static int A = 5; /* added static */
    public static int B = 2 * A; /* added static */
    public int C = A * B;
    public static int D = A * B; /* added static */

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
