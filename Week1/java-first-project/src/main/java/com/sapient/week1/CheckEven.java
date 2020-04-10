package com.sapient.week1;

import java.util.Scanner;

class CheckEven {
    public static boolean check(Integer num) {
        return num%2 == 0 ? true : false;
    }

    public static void main( final String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        Integer num = sc.nextInt();

        String result = CheckEven.check(num)? "Even" : "Odd";

        System.out.println(String.format("The Number %d is %s", num, result));
        
        sc.close();
    }
}