import java.util.Scanner;
/*
purpose: Temperature conversion program
Author name:
Date: Apr 7/2025
start and finish time: 11:00 am - 11:30 am
     - convert celsius to fahrenheit and vice versa based on the user's preference
*/

public class Exercise2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Temeperature Converter");
        System.out.println("1. Fahrenheit to celsius");
        System.out.println("2. Celsius to Fahrenheit");


        System.out.println("Enter your choice number");
        int choiceNumber = input.nextInt();

        System.out.println("Enter the temperature: ");
        double temperature = input.nextDouble();

        double result;
        if(choiceNumber == 1){
            result = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F is equal to " + result +"°C");     
        }
        else if (choiceNumber == 2){
            result = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C is equal to " + result + "°F");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}