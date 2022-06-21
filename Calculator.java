// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Calculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
   double num1=0;
   double num2=0;
   double answer=0;
    
     System.out.println("Enter your first number: ");
     num1 = scan.nextDouble();
     
     
     System.out.println("Enter your second number: ");
     num2 = scan.nextDouble();
     
     
     System.out.println("Enter desired operation: \n --1.add \n --2.subtract, \n --3.multiply, \n --4.division, \n --5.mod ");
     
      int button_input = scan.nextInt();
      
     
     
     
    switch(button_input)
    {
        case 1:
            answer= num1+num2;
            
            System.out.println(answer);
            
            break;
            
        case 2:
            
            answer= num1-num2;
            System.out.println(answer);
            break;
            
        case 3:
            answer= num1*num2;
           System.out.println(answer);
            break;
            
        case 4:
            answer= num1/num2;
            System.out.println(answer);
            break;
            
        case 5:
           answer= num1%num2;
           System.out.println(answer);
            break;
            
        default:
             
            System.out.println("User did not press the correction choice");
            
    }
    
        System.out.println("End of Program"); 
        
         
    }
}