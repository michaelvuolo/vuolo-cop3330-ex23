/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // record choice
        System.out.print("Is the car silent when you turn the key? ");
        char choice = input.next().charAt(0);

        if (choice == 'y') {
            System.out.print("Are the battery terminals corroded? ");
            choice = input.next().charAt(0);

            if (choice == 'y')
                System.out.print("Clean terminals and try starting again.");
            else if (choice == 'n')
                System.out.print("Replace cables and try again.");
        } else if (choice == 'n') {
            System.out.print("Does the car make a slicking noise? ");
            choice = input.next().charAt(0);

            if (choice == 'y')
                System.out.print("Replace the battery.");
            else if (choice == 'n') {
                System.out.print("Does the car crank up but fail to start? ");
                choice = input.next().charAt(0);

                if (choice == 'y')
                    System.out.print("Check spark plug connections.");
                else if (choice == 'n') {
                    System.out.print("Does the engine start and then die? ");
                    choice = input.next().charAt(0);

                    if (choice == 'y') {
                        System.out.print("Does you car have fuel injection? ");
                        choice = input.next().charAt(0);

                        if (choice == 'y')
                            System.out.print("Get it in for service.");
                        else if (choice == 'n')
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }
                    else if (choice == 'n') {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}

