import java.util.Scanner;
public class IceDrinks {


    public static void main(String[] args) {

        System.out.println("Welcome to Father Joe's Ice Drinks!");
        // TODO code application logic her
        String one = ("Strawberry");
        String two =  ("Apple");
        String three = ("Blueberry");

       
        System.out.println("The flavors are! ");
        System.out.println("1. " + " " +  one);
        System.out.println("2. " + " " +  two);
        System.out.println("3. " + " " +  three);
        
        Scanner User_Imput = new Scanner (System.in); //creating Scanner object
        
        int initial_Selection;
        System.out.println("What flavor would you like? Enter your selection (1, 2, or 3)");
        initial_Selection = User_Imput.nextInt();
        
        String add_statement = "..." + "\n" + "..." + "\n" + "yummy and so delicious! ";
        if(initial_Selection ==1){
            System.out.println("Enter how many fluid ounces to add? (1-6)");
            int flavor_Selection;
            flavor_Selection = User_Imput.nextInt();
            
            
            if (flavor_Selection > 6){
                System.out.println("I'm sorry that is not a valid selection.");
                
            }else {
                System.out.println("Adding" + " " + flavor_Selection + " " + "fluid ounces to the ice drink!" );
                System.out.print(add_statement);
            }
            
        } else if (initial_Selection == 2){
            System.out.println("Enter how many fluid ounces to add? (1-6)");
            int flavor_Selection;
            flavor_Selection = User_Imput.nextInt();
            
            
            if (flavor_Selection > 6){
                System.out.println("I'm sorry that is not a valid selection.");
                
            }else {
                System.out.println("Adding" + " " + flavor_Selection + " " + "fluid ounces to the ice drink!" );
                System.out.print(add_statement);
            }
    } else if (initial_Selection == 3){
            System.out.println("Enter how many fluid ounces to add? (1-6)");
            int flavor_Selection;
            flavor_Selection = User_Imput.nextInt();
            
            
            if (flavor_Selection > 6){
                System.out.println("I'm sorry that is not a valid selection.");
                
            }else {
                System.out.println("Adding" + " " + flavor_Selection + " " + "fluid ounces to the ice drink!" );
                System.out.print(add_statement);  
    }


     }
        
    
    
}
 
}
