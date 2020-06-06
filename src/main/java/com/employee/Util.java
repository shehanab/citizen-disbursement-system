package com.employee;

public class Util {

    private Util(){

    }

     public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

        public static boolean isBlank(String input) {
            return input == null || input.trim().isEmpty();
        }
}
