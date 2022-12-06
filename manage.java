import java.util.*;
public class manage {
    public static void main(String[] args) {
        System.out.println("Welcome to our bank");
        long nebal =0;
        // menu

        System.out.println("A) Check the balance");
        System.out.println("B) Deposit");
        System.out.println("C) Withdraw");
        System.out.println("D) Exit");
        System.out.println("**********************************");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter the letter");
            String choice = scan.next();
            
            //check the balance 
            if(choice.equals("a")){
                System.out.println("**************************");
                System.out.println();
                System.out.println("balance="+nebal+"$");
                System.out.println();
                System.out.println("************************");
            }

               //deposit
           else if(choice.equalsIgnoreCase("b")){
                System.out.println("Enter the amount");
                int n = scan.nextInt();
                if(n<=0){
                    System.out.println("Note:- Enter the valid amount");
                }
            else{
                      nebal = nebal+n;
                      System.out.println("Note: Your account sucessfully deposited");     
            }
        }
        else if(choice.equalsIgnoreCase("c")){
            System.out.println("Enter the amount");
            int w = scan.nextInt();
            if(w<=0){
                System.out.println("Note:- Enter the valid amount");
            }
        else{
                  nebal = nebal-w;
                  System.out.println("Note: Your account sucessfully withdraw ");     
        }
    }
    
    else if (choice.equalsIgnoreCase("d")){
        System.out.println("Thank you using our service");
        System.out.println("******************************");
        break;
    }
}
    }}
             
        
    
    