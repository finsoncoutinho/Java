package com.fin;
import java.util.Scanner; // to take input



public class TakingInput {

    public static void main(String[] args) {

        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in); //create scanner object
        String name= sc.nextLine();  // nextLine() to take string inputs
        System.out.print("Enter your age : ");
        int age = sc.nextInt();// nextInt() to take integer inputs
        System.out.println("Hey " + name + "! Nice to meet you.\n Your age is "+ age);


    }
}
