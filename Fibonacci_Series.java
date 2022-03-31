package com.fin;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int a=0,b=1,temp;
        if(num==0){
            System.out.println(a);
        }
        else if(num==1){
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(a);
            System.out.println(b);

            for(int i=2;i<num;i++){

                temp=b;
                b=b+a;
                a=temp;
                System.out.println(b);

            }
        }


    }
}
