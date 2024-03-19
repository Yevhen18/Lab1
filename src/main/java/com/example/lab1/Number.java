package com.example.lab1;

public class Number
{
    public static int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return rev;
    }
}
