import java.util.*;

public class calculator{
public static void main(String args[]) {
    //scanner function to take inputs
 Scanner sc =new Scanner(System.in); 
    
    //to insert the operations you wan to apply
    System.out.println("Enter the operations you wnat to apply");
    String operation = sc.nextLine();
    
    //enter the first number
    System.out.println("Enter the 1st number:");
    int a = sc.nextInt();
    
    //enter the second number
    System.out.println("Enter the 2nd number:");
    int b = sc.nextInt();

    
    //using switch to choose operation you want to apply between numbers
    switch (operation) {
        case "+":System.out.println(a+b);
            break;
        
        case "-":System.out.println(a-b);
            break;
        
        case "*":System.out.println(a*b);
            break;
        
        case "/":System.out.println(a/b);
            break;

        case "%":System.out.println(a%b);
            break;
        default:System.out.println("invalid operatios");
            break;
    }
}
}