import java.util.Scanner;
/*
purpose: fizzbuzz 
    - if the number is multiple of 3 print fizz
    - if number is multiple of 5 print buzz
    - if number is both multiple of 3 and 5 print fizzbuzz
    - other wise print the number it self
*/
public class fizzBuzz{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcom to fizzbuzz!");
        System.out.print("Enter the number: ");
            int number = input.nextInt();
        
        if (number % 5 == 0 && number % 3 == 0)
                System.out.println("FizzBuzz");
        else if (number % 5 == 0)
                System.out.println("Fizz");
        else if (number % 3 == 0)
                System.out.println("Buzz");
        else
            System.out.println(number);
    }
}

