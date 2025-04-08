/*
purpose: reads the user age and tell their scope
        -take users age
        -tell their scope based on their age
*/

import java.util.Scanner;

public class Exercise4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = input.nextInt();

        if(age < 18){
            System.out.println("You are a child");
        }
        else if(age >= 18 && age < 65){
            System.out.println("You are an adult");
        }
        else if(age > 65){
            System.out.println("You are a senior citizen");
        } 
        else{
            System.out.println("Invalid Input");
        }
    }
}
