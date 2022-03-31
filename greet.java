package com.fin;
import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Helloo !! "+ name);
    }
}
