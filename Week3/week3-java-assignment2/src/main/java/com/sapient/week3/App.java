package com.sapient.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( Arrays.toString(args) );
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n------------------------------- CommandLine1 -------------------------------");

        CommandLine1 commandLine1 = new CommandLine1();
        commandLine1.setData(args);
        commandLine1.calData();
        commandLine1.displayData();

        System.out.println("\n\n------------------------------- KeyReadLine2 --------------------------------");

        KeyReadLine2 keyReadLine2 = new KeyReadLine2();
        System.out.print("Enter numbers : ");
        keyReadLine2.read(sc.nextLine());
        keyReadLine2.display();
        keyReadLine2.sort();
        keyReadLine2.display();

        System.out.print("Enter Number to Search : ");
        int key = 0;
        key = sc.nextInt();
        keyReadLine2.search(key);
        
        System.out.println("\n\n------------------------------- NumberToWord --------------------------------");
        System.out.print("Enter Number : ");
        long num = sc.nextLong();
        System.out.println(String.format( "The Num %d in words is : %s", num, NumberToWord.numToWord(num)));
        sc.close();
    }
}
