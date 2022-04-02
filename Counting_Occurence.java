package com.fin;
import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int i=1, count=0;

        while(i>0){
            i=a%10; //gives the last digit
            a=a/10; // removes the last digit
            if (i==7){
                count++;
            }
        }
        System.out.println(count);

    }
}
