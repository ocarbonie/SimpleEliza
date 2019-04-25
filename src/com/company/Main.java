package com.company;
/*
Your first task is to develop a program with a running loop.
If the user types in "I am feeling great" or enter "Q", the program will stop running.
Your program should print out the last input (as an output) every time before accepting new input.
Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit: ");
        answerTherapist(input.nextLine());


    }
    public static void answerTherapist(String m){
        Scanner input = new Scanner(System.in);

        while(!m.equalsIgnoreCase("Q")){
            System.out.print(m);

            System.out.print("\nEnter your response here or Q to quit: ");
            m = input.nextLine();

            if(m.equalsIgnoreCase("i am feeling great")){
                break;
            }

        }
        System.out.print(">>>END");

    }
}
