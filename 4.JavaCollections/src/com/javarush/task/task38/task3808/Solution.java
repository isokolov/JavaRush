package com.javarush.task.task38.task3808;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* 
Неверные аннотации
*/

public class Solution {

    //@Main
    @Main
    public static void main(String[] args) {
        Solution solution = new Solution().new SubSolution();
        solution.overriddenMethod();
    }

    public void overriddenMethod() {
    }

    public class SubSolution extends Solution {
        //@SafeVarargs
        @Override
        public void overriddenMethod() {
            System.out.println(uncheckedCall());
        }

        //@Override
        @SuppressWarnings("unchecked")
        List uncheckedCall() {
            List list = new ArrayList();
            list.add("hello");
            return list;
        }
    }


}