package chapter4;

import javax.swing.*;
import java.util.Scanner;

public class ClassAverage {

    //Fig. 4.8
    /*public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10) {
            System.out.print("Enter grade:");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total/10;

        System.out.printf("%nTotal of all 10  grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

    }*/

    //FIg.4.10
    //Solving the class-Average problem using sentinel-controlled iteration.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else { System.out.println("No grades were entered");};
    }
}
