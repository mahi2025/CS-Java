import java.util.Scanner;
/*
    purpose: To list things using loops
*/
public class loop{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("List of menu:");   
        System.out.println("1. sum of n");  
        System.out.println("2. To list even numbers");  
        System.out.println("3. To list odd numbers"); 
        System.out.println("4. To list any number"); 

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        switch(choice){
            case 1: 
                System.out.println("Enter the number: "); 
                int n = input.nextInt();
                int sum = 0;  
                for(int i = 1; i <= n; i++){  
                    sum += i;  
                }
                System.out.println("The sum of the numbers is " + sum); 
                break;

            case 2:
                System.out.println("Enter the number: "); 
                n = input.nextInt();
                for(int i = 0; i < n; i++){  
                    if(i%2 == 0)
                        System.out.println("The even numbers is " + i);
                }
                break; 

            case 3:
                System.out.println("Enter the number: "); 
                n = input.nextInt();
                for(int i = 0; i < n; i++){  
                    if(i%2 != 0)
                        System.out.println("The odd numbers is " + i);   
                } 
                break;

            case 4:
                System.out.println("Enter the number: "); 
                n = input.nextInt();
                for(int i = 0; i <= n; i++){  
                    if(i%2 == 0){
                        System.out.println(i + " is even");
                    }
                    else {
                        System.out.println(i + " is odd");
                    }
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}