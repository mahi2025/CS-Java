import java.util.Scanner;
/*
purpose: To tell studnets their grade baes on their scale 
Author name: Mahi Masre
    - Take input form the user
    - Give their grades based on their scale
*/

public class Exercise1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        
        int percentage = input.nextInt();

        if(percentage > 90)
            System.out.println("Your Grade is A");
        else if(percentage >= 90 && percentage > 85)
            System.out.println("Your Grade is A-");
        else if(percentage >= 85 && percentage > 82)
            System.out.println("Your Grade is B+");
        else if(percentage >= 82 && percentage > 76)
            System.out.println("Your Grade is B");
        else if(percentage >= 76 && percentage > 70)
            System.out.println("Your Grade is C+");
        else if(percentage >= 70 && percentage > 61)
            System.out.println("Your Grade is C");
        else if(percentage >=61 && percentage > 50)
            System.out.println("Your Grade is C-");
        else if(percentage >= 50 && percentage > 43)
            System.out.println("Your Grade is D");
        else if(percentage <= 43)
            System.out.println("Your Grade is F");
        else
            System.out.println("Invalid percentage");
    }
}
