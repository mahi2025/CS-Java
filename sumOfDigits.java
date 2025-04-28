/*
    purpose: Calculate the sum of the digits of a six-digit integer
    Steps: 1. prompt for input six digit integer
             2. use / and % to extract the digits from the integer
*/

import java.util.Scanner;

public class sumOfDigits{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a six digit integer:");
        int number = input.nextInt();
         int sum = 0;

         if(number < 100000 || number > 999999){
            System.out.println("Invalid input. Please enter a six-digit integer");
         }
         else{
            sum = number / 100000 + (number / 10000) % 10 + (number / 1000) % 10 + (number / 100) % 10 + (number / 10) % 10 + number % 10;
            System.out.println("The sum of the digits is: " + sum);
         }
         input.close();
    }
}
