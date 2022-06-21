// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Month {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
     System.out.print("Enter month number: ");
     int month = scan.nextInt();
     System.out.println();
   
      
      
     
     
     
    switch(month)
    {
        case 1:
            
            System.out.println("Month "+month+" is Jan.");
            
            
            break;
            
        case 2:
            
            System.out.println("Month "+month+" is Feb.");
            
            break;
            
        case 3:
            
            System.out.println("Month "+month+" is Mar.");
            break;
            
        case 4:
           
             System.out.println("Month "+month+" is Apr.");
            break;
            
        case 5:
             System.out.println("Month "+month+" is May.");
            
            break;
            
        case 6:
             System.out.println("Month "+month+" is Jun.");
           
            
            break;
            
        case 7:
             System.out.println("Month "+month+" is Jul.");
           
            break;
            
        case 8:
            System.out.println("Month "+month+" is Aug.");
            
            break;
            
        case 9:
            System.out.println("Month "+month+" is Sep.");
          
            break;
        case 10:
            System.out.println("Month "+month+" is Oct.");
          
            break;
        case 11:
            System.out.println("Month "+month+" is Nov.");
          
            break;
        case 12:
           
           System.out.println("Month "+month+" is Dec.");
            break;
            
        default:
             
            System.out.println("User did not press the correction choice");
            
    }
        System.out.println(); 
        System.out.println("End of Program"); 
        
         
    }
}