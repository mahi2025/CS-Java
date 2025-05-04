import java.util.Scanner;
import java.text.NumberFormat;
/*
purpose: Mortage calculator to calculate Monthly payment

*/
public class mortageCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        final byte Month_In_year = 12;
        final byte Percent = 100;

        System.out.println("Mortage Calculator");

        System.out.print("principal: ");
            int principal = input.nextInt();

        System.out.print("Annual interest rate: ");
            float annualInterest = input.nextFloat();
            float monthlyInterest = annualInterest/Percent / Month_In_year;

             
        System.out.print("period/year: ");
            byte years = input.nextByte();
            int numberOfPayments = years * Month_In_year;

    
        double mortage = principal
            * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments)) 
            / (Math.pow(1+ monthlyInterest, numberOfPayments) -1 );

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortage: " + mortageFormatted);
        input.close();
    }
}