import java.util.Scanner;
/*
    purpose: To make pattern
*/
public class pattern{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("list of menu");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Same number");
        System.out.println("4. number");
         System.out.println("5.l");


        System.out.println("choice form 1-5");
        int choice=input.nextInt();
    
     System.out.println("Enter the number: ");
            int n=input.nextInt();
    switch(choice){
        case 1: 
             for(int x=1; x<=n;x++){
              for(int y=1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
            }
            break;
        case 2:
             for(int x=1; x<=n;x++){
              for(int y=1; y<=n; y++){
                System.out.print("*");
            }
            System.out.println();
            }
            break;
        case 3:
               for(int x=1; x<=n;x++){
              for(int y=1; y<=n;y++){
                System.out.print(x);
            }
            System.out.println();
               }
               break;
        case 4:
               for(int x=1; x<=n;x++){
              for(int y=1; y<=n; y++){
                System.out.print(y);
            }
            System.out.println();
            }
            break;
        case 5:
            for(int x=1; x<=n;x++){
             if(x<n){
                System.out.println("*");
             }
             else{
                for(int y=1;y<=n;y++){
                    System.out.print("*");
                }
             }
            }
        default:
            System.out.println();
    }
    }
}