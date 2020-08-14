// this is a simple calculator code which prompts the user to choose from a given set of operations to be performed
package arbind_javacode;
import java.util.Scanner;

public class calculator {



    public static void main(String args[])
    {
        Float a, b, res;                              // defining the variables
        char choice, ch;
        Scanner scan = new Scanner(System.in);
		
        do                                          // providing the user with the options to choose the operations from
        {
        	System.out.print("Please Choose From The Following Options:\n\n");
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Division\n");
            System.out.print("4. Multiplication\n");
            System.out.print("5. Average\n");
            System.out.print("6. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            
            switch(choice)                          //using a switch case to execute block of statements depending upon the user choices
            {
                case '1' :                          // when user chooses 1 this block of code will be executed where user is asked to enter 2 numbers and the result is calculated
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a + b;
                    if (res<0)                     // if the result is negative a message will be displayed to the user
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 1 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;                           // the break statement will terminate the loop and next and the program control will resume at the next statement
                    
                case '2' :                          // when user chooses 2 this block of code will be executed
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a - b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 2 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;
                    
                case '3' :                         // when user chooses 3 this block of code will be executed
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a / b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 3 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;
                    
                case '4' :                       // when user chooses 4 this block of code will be executed
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                   
                    res = a * b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 4 is returning negative answer");
                    }
                    else
                    {
                    
                    System.out.print("Result = " + res);
                    }
                    break;
                    
                case '5' :                     // when user chooses 5 this block of code will be executed
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
               
                    res =(a + b)/2;
                    if (res<0)
                    {
                	 System.out.println("Result = " + res);
                	System.out.println("Oops option 5 is returning negative answer");
                    }
                    else
                    {
                
                    System.out.print("Result = " + res);
                    }
                    break;
                    
                case '6' : 
                	System.exit(0);                       // when user chooses 6 this block of code will be executed
                    break;
                    default : System.out.print("Wrong Choice choose from 1 to 6!!!");
                    break;
            }
            System.out.print("\n-------------------------------------------\n");
        }
        while(choice != 6);                         // the system will throw error message when the user makes choice other than from 1 to 6
    }
}