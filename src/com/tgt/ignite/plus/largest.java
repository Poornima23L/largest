package com.tgt.ignite.plus;

import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        double a,b,c,first,second;
        Scanner read= new Scanner(System.in);
        System.out.println("enter 1st num :a=");
        a = read.nextDouble();
        System.out.println("enter 2nd num :b=");
        b = read.nextDouble();
        System.out.println("enter 3rd num :c=");
        c = read.nextDouble();
        if(a>b && a>c){
            first =a ;
            System.out.println("the first largest num is" +a);
            if(b>c){
                second=b;
                System.out.println("the second largest num is"+b);
            }
            else{
                second=c;
            }
        }
        else if(b>a && b>c){
            first =b ;
            System.out.println("the first largest num is"+b);
            if(a>c){
                second=a;
                System.out.println("the second largest num is"+a);
            }
            else{
                second=c;
                System.out.println("the second largest num is"+c);
            }
        }
        else{
            first =c;
            System.out.println("the first largest num is"+c);
            if(b>a){
                second=b;
                System.out.println("the second largest num is"+b);
            }
            else{
                second=c;
                System.out.println("the second largest num is"+c);
            }
        }





    }
}
