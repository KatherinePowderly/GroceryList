import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please list three items on your grocery list. \n");
        out.println("Item 1? ");
        String First;
        First = keyboard.nextLine();

        out.println("Item 2? ");
        String Second;
        Second = keyboard.nextLine();

        out.println("Item 3? ");
        String Third;
        Third = keyboard.nextLine();
        
        System.out.print("\n");

        out.println("Now please enter the quantity of each item. \n");
        out.println("How many " + First + "?");
        int firstNo = keyboard.nextInt();

       
        out.println("How many " + Second + "?");
        int secondNo = keyboard.nextInt();

        out.println("How many " + Third + "?");
        int thirdNo = keyboard.nextInt();

        
        System.out.print("\n");

        out.println("Please enter price of each item. \n");
        out.println("How much does one " + First + " cost?"); 
        float price1 = keyboard.nextFloat();

        price1 = firstNo * price1;
      
        out.println("How much does one " + Second + " cost?");
        float price2 = keyboard.nextFloat();

        price2 = secondNo * price2;

        out.println("How much does one " + Third + " cost?");

        float price3 = keyboard.nextFloat();
        
        price3 = thirdNo * price3;

        out.println("Calculating your grocery bill.\n");

        float total;
        total = price1 + price2 + price3;

        

        out.println("Your total is " + total + ".");

        
        
        
    }
}

        