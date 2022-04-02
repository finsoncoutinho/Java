package com.fin;
import java.util.Scanner;
public class Reverse_num {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number :");
        int num= sc.nextInt();
        int rev=0;

        while(num>0){
            int a= num%10; //to get last digit
            rev=rev*10+a;  // to put the digits at rit position
            num=num/10;
        }
        System.out.println(rev);

    }
}
