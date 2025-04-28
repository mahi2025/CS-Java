/*
purpose: multiple of the other using conditional operators
    - take weo integer from user
    -promot for input
    -use conditional operator tp check if the first integer is a multiple of the second
    -display the result
*/

import java.util.Scanner;

public class Exercise5{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firtsNumber = input.nextInt();
        System.out.println("Enter the second integer: ");
        int secondNumber = input.nextInt();
            //it uses the ternary operator 
            //Ternary operator = condition ? value_if_true : value_if_false;
        String result = (firtsNumber % secondNumber == 0) ? "is a multiple" : "is not a multiple";
        System.out.println("The first number " + result + " of the second number.");

        input.close();
    }

