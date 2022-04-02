package com.fin;

import java.util.Scanner;

public class Percentage_Calculator {

    public static void main(String[] args) {

        int totalMarks =0;
        float percentage;

        System.out.println("Marks To Percent Calculator !! " );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name= sc.nextLine();
        System.out.print("Enter Number of Subjects : ");
        int NoSub = sc.nextInt();

        for (int i= 1; i<=NoSub; i++) //For loop to take marks input
        {
            System.out.print("Enter Marks of Subject "+ i + " :");
            int marks= sc.nextInt();
            totalMarks= totalMarks + marks;
        }

        percentage= (float)(((float) totalMarks/(NoSub*100))*100);

        System.out.println( name + " your Percentage is: " + percentage + "%");
    }

}
