import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;
/*
purpose: Temperature conversion program
Author name:
Date: [Automatically generated]
*/

public class Exercise2{
    private static LocalDateTime startTime;
    private static LocalDateTime endTime;

    public static void main(String[] args){
        // Record start time
        startTime = LocalDateTime.now();
        System.out.println("Program started at: " + startTime);

        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter");
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

        // Record end time and calculate duration
        endTime = LocalDateTime.now();
        System.out.println("\nProgram ended at: " + endTime);
        
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        long seconds = duration.toSecondsPart();
        
        System.out.println("Total time taken: " + minutes + " minutes and " + seconds + " seconds");
        
        input.close();
    }
}