import java.util.Scanner;
/**
 Purpose: different operation using switch
 */
public class operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("List of menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Arithmetic");
        System.out.println("4. Arthmetic Calculator");
        System.out.println("5. Area of circle");
        System.out.println("6. Area of Triangle");
        System.out.println("7. Swap");
        System.out.print("Enter your choice (1-7): ");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Fahrenheit to Celsius conversion");
                System.out.println("Enter the temperature value");
                
                int temperature = input.nextInt();
                int result=(temperature-32)*5/9;
                System.out.println(temperature + " °f is equal to " + result + "°C");
                break;

            case 2:
                System.out.println("Celsius to Fahrenheit conversion");
                System.out.println("Enter the temperature value");
                 
                 temperature = input.nextInt();
                 result = (temperature*9/5)+32;
                 System.out.println(temperature + "°C is equal to" + result + "°f");
                break;  

            case 3:
                 System.out.println("Arithmetic operations ");

                 System.out.println("enter the first number");
                      int num1=input.nextInt();
                 System.out.println("enter the second number");
                      int num2=input.nextInt();
                
                    int sum=num1+num2;
                    int difference=num1-num2;
                    int product=num1*num2;
                    double quotient=num1/num2;

                System.out.println("the sum is "+sum);
                System.out.println("the difference is "+difference);
                System.out.println("the product is "+product);
                System.out.println("the quotient is "+quotient);
                break;

            case 4: //Arithmetic Calculator
                System.out.println("Arithmetic Calculator");
                System.out.println("Enter the first number: ");
                int calcNum1 = input.nextInt();
                
                System.out.println("Enter the operator from (+,-,*,/)");
                char calcOperator = input.next().charAt(0);

                System.out.println("Enter the second number: ");
                int calcNum2 = input.nextInt();

                int calcResult = 0;
                boolean validOperator = true;

                switch(calcOperator){
                    case '+':
                        calcResult = calcNum1 + calcNum2;
                        break;
                    case '-':
                        calcResult = calcNum1 - calcNum2;
                        break;
                    case '*':
                        calcResult = calcNum1 * calcNum2;
                        break;
                    case '/': 
                       if (calcNum2 != 0) {
                            calcResult = calcNum1 / calcNum2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");
                            validOperator = false;
                        break;
                    default:
                        System.out.println("Error: Invalid operator!");
                        validOperator = false;
                }
                
                if (validOperator) {
                    System.out.println(calcNum1 + " " + calcOperator + " " + calcNum2 + " = " + calcResult);
                }
                break;
                
            case 5:
                System.out.println("Area of circle");
                System.out.println("Enter the radius: ");
                    double radius = input.nextInt();
                
                final double PI = 3.14;
                double Area = PI *radius*radius;

                System.out.println("The Area is: " + Area);
                break;  
            case 6: 
                    System.out.println("Area of Triangle");
                    
                    System.out.println("Enter the base: ");
                     double base = input.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = input.nextDouble();
                
            
                     Area = (base*height)/2;

                System.out.println("The Area of triangle is: " + Area);
                break;  
            case 7:
                System.out.println("Swapping");
                int x = 10;
                int y = 8;
                int z = 12;

                System.out.println("Before Swapping:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                
                    int temp = x;
                    x = y;
                    y = z;
                    z = temp;

                System.out.println("After Swapping:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                break;

            default:
                System.out.println("Invalid choice! Please select between 1-7");
        }
    }
}