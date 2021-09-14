/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hello, "+name+", nice to meet you!");
    }
}
