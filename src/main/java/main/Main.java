package main;

import org.apache.commons.collections4.bag.HashBag;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         Calc calc = new Calc();

         System.out.println("First number");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         System.out.println("Second number");
         int b = sc.nextInt();
         System.out.println("Operation");
         char oper = sc.next().charAt(0);
         if (oper == '+') {
             System.out.println(calc.sum(a, b));
         }else if (oper == '-') {
             System.out.println(calc.sub(a, b));
         }else if (oper == '*') {
             System.out.println(calc.mult(a,b));
         }else if (oper == '/'){
             System.out.println(calc.div (a,b));

    }
        }
         }




